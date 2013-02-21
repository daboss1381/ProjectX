package projectx.user

import org.zkoss.zk.ui.Component
import org.zkoss.zul.*
import org.zkoss.zk.ui.event.*
import projectx.User

class ListComposer {
    Grid grid
    ListModelList listModel = new ListModelList()
    Paging paging
    Longbox idLongbox

    def afterCompose = {Component comp ->
        grid.setRowRenderer(rowRenderer as RowRenderer)
        grid.setModel(listModel)
        redraw()
    }

    void onClick_searchButton(Event e) {
        redraw()
    }

    void onPaging_paging(ForwardEvent fe) {
        def event = fe.origin
        redraw(event.activePage)
    }

    private redraw(int activePage = 0) {
        int offset = activePage * paging.pageSize
        int max = paging.pageSize
        def userInstanceList = User.createCriteria().list(offset: offset, max: max) {
            order('id','desc')
            if (idLongbox.value) {
                eq('id', idLongbox.value)
            }
        }
        paging.totalSize = userInstanceList.totalCount
        listModel.clear()
        listModel.addAll(userInstanceList.id)
    }

    private rowRenderer = {Row row, Object id, int index ->
        def userInstance = User.get(id)
        row << {
                a(href: g.createLink(controller:"user",action:'edit',id:id), label: userInstance.id)
                label(value: userInstance.username)
                label(value: userInstance.password)
                label(value: userInstance.accountExpired)
                label(value: userInstance.accountLocked)
                label(value: userInstance.enabled)
                hlayout{
                    toolbarbutton(label: g.message(code: 'default.button.edit.label', default: 'Edit'),image:'/images/skin/database_edit.png',href:g.createLink(controller: "user", action: 'edit', id: id))
                    toolbarbutton(label: g.message(code: 'default.button.delete.label', default: 'Delete'), image: "/images/skin/database_delete.png", client_onClick: "if(!confirm('${g.message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}'))event.stop()", onClick: {
                        User.get(id).delete(flush: true)
                        listModel.remove(id)
                    })
                }
        }
    }
}