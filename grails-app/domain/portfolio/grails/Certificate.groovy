package portfolio.grails

class Certificate {
    String title
    String issuer
    Date date
    String description
    User user

    static constraints = {
        title nullable: false, blank: false
        issuer nullable: false, blank: false
        date nullable: false, blank: false
        description nullable: false, blank: false
    }
}
