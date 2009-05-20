class KiRole {
    String name

    static constraints = {
        name(nullable: false, blank: false, unique: true)
    }
}
