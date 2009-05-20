class KiRolePermissionRel {
    KiRole role
    KiPermission permission
    String target
    String actions

    static constraints = {
        actions(nullable: false, blank: false)
    }
}
