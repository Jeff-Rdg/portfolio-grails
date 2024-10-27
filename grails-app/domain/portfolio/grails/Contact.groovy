package portfolio.grails

class Contact {
    String name
    String email
    String subject
    String message

    static constraints = {
        name nullable: false, blank: false
        email nullable : false, blank: false
        subject nullable: false, blank: false
        message nullable: false, blank: false
    }
}
