package portfolio.grails

class User {
    String name
    String email
    String password
    String bio

    static constraints = {
        name nullable: false, blank: false
        email nullable: false, blank: false
        password nullable: false, blank: false
        bio nullable: true, blank: true
    }
}
