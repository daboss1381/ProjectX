package projectx.register

import org.zkoss.zk.ui.Component
import org.zkoss.zk.ui.event.Event
import org.zkoss.zul.*
import projectx.Register

class CreateComposer {
    Window self
    def afterCompose = {Component comp ->
        //todo initialize components here
    }

    void onClick_saveButton(Event e) {
        def registerInstance = new Register(self.params)
        if (!registerInstance.save(flush: true) && registerInstance.hasErrors()) {
            log.error registerInstance.errors
            self.renderErrors(bean: registerInstance)
        } else {
            flash.message = g.message(code: 'default.created.message', args: [g.message(code: 'register.label', default: 'Register'), registerInstance.id])
            redirect(controller: "register", action: "list")
        }
    }
}