package projectx

class RegisterController {

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {}

    def create = {
        def registerInstance = new Register()
        registerInstance.properties = params
        return [registerInstance: registerInstance]
    }

    def edit = {
        def registerInstance = Register.get(params.id)
        if (!registerInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'register.label', default: 'Register'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [registerInstance: registerInstance]
        }
    }

}
