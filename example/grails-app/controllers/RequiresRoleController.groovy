import org.apache.ki.authz.annotation.RequiresRoles

class RequiresRoleController {

    @RequiresRoles('Role1')
    def index = {
    }
}
