import projectx.Role
import projectx.User
import projectx.UserRole

class BootStrap {
    def springSecurityService
    def init = { servletContext ->
        def admin = new User(username:"admin",
            password:"3123",							
            enabled: true)
        
        admin.save()
        
        def userRole = Role.findByAuthority("ROLE_USER")?: new Role(authority: "ROLE_USER").save()
        def adminRole = Role.findByAuthority("ROLE_ADMIN")?: new Role(authority: "ROLE_ADMIN").save()
		
        def userrole = new UserRole(
            user: admin,
            role: adminRole				
        )
        userrole.save()
        
        def userrole2 = new UserRole(
            user: admin,
            role: userRole
        )
	userrole2.save()
    }
    def destroy = {
    }
}
