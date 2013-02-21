package projectx.user

import org.zkoss.zk.ui.Component
import org.zkoss.zk.ui.event.Event
import org.zkoss.zul.*
import projectx.User

class CreateComposer {
    Window self
    def afterCompose = {Component comp ->
        //todo initialize components here
    }

    void onClick_saveButton(Event e) {
        def userInstance = new User(self.params)
        if (!userInstance.save(flush: true) && userInstance.hasErrors()) {
            log.error userInstance.errors
            self.renderErrors(bean: userInstance)
        } else {
            flash.message = g.message(code: 'default.created.message', args: [g.message(code: 'user.label', default: 'User'), userInstance.id])
            redirect(controller: "user", action: "list")
        }
    }
}