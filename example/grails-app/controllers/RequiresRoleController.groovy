import org.apache.ki.authz.annotation.RequiresRoles

class RequiresRoleController {

    @RequiresRoles('role1')
    def index = {
    }
}
