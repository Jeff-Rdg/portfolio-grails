package portfolio.grails

class Certificate {
    String title
    String issuer
    Date date
    String description

    static hasOne = [user: User]

    static constraints = {
        title nullable: false, blank: false
        issuer nullable: false, blank: false
        date nullable: false, blank: false
        description nullable: false, blank: false
    }
}
