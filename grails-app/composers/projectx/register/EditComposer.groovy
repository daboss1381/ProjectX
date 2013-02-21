package projectx.register

import org.zkoss.zk.ui.Component
import org.zkoss.zk.ui.event.Event
import org.zkoss.zul.*
import projectx.Register

class EditComposer {
    Window self
    def afterCompose = {Component comp ->
        //todo initialize components here
    }

    void onClick_saveButton(Event e) {
        def params=self.params
        def registerInstance = Register.get(params.id)
        if (registerInstance) {
            if (params.version != null) {
                def version = params.version
                if (registerInstance.version > version) {
                    String failureMessage = g.message(code:"default.optimistic.locking.failure",args:[g.message(code: 'register.label', default: 'Register')],default:"Another user has updated this ${registerInstance} while you were editing")
                    Messagebox.show(failureMessage, g.message(code:'error',default:'Error'), Messagebox.YES, Messagebox.ERROR)
                    return
                }
            }
            registerInstance.properties = params
            if (!registerInstance.hasErrors() && registerInstance.save(flush: true)) {
                flash.message = g.message(code: 'default.updated.message', args: [g.message(code: 'register.label', default: 'Register'), registerInstance.id])
                redirect(controller: "register", action: "edit", id: registerInstance.id)
            }else {
                log.error registerInstance.errors
                self.renderErrors(bean: registerInstance)
            }
        }
        else {
            flash.message = g.message(code: 'default.not.found.message', args: [g.message(code: 'register.label', default: 'Register'), params.id])
            redirect(controller: "register",action: "list")
        }

    }
}