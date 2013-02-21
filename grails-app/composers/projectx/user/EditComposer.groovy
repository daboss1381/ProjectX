package projectx.user

import org.zkoss.zk.ui.Component
import org.zkoss.zk.ui.event.Event
import org.zkoss.zul.*
import projectx.User

class EditComposer {
    Window self
    def afterCompose = {Component comp ->
        //todo initialize components here
    }

    void onClick_saveButton(Event e) {
        def params=self.params
        def userInstance = User.get(params.id)
        if (userInstance) {
            if (params.version != null) {
                def version = params.version
                if (userInstance.version > version) {
                    String failureMessage = g.message(code:"default.optimistic.locking.failure",args:[g.message(code: 'user.label', default: 'User')],default:"Another user has updated this ${userInstance} while you were editing")
                    Messagebox.show(failureMessage, g.message(code:'error',default:'Error'), Messagebox.YES, Messagebox.ERROR)
                    return
                }
            }
            userInstance.properties = params
            if (!userInstance.hasErrors() && userInstance.save(flush: true)) {
                flash.message = g.message(code: 'default.updated.message', args: [g.message(code: 'user.label', default: 'User'), userInstance.id])
                redirect(controller: "user", action: "edit", id: userInstance.id)
            }else {
                log.error userInstance.errors
                self.renderErrors(bean: userInstance)
            }
        }
        else {
            flash.message = g.message(code: 'default.not.found.message', args: [g.message(code: 'user.label', default: 'User'), params.id])
            redirect(controller: "user",action: "list")
        }

    }
}