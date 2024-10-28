package portfolio.grails

class Testimonial {
    String name
    String position
    String message

    static belongsTo = [user: User]

    static constraints = {
        name nullable: true, blank: true
        position nullable: false, blank: false
        message nullable: false, blank: false
    }

    def beforeInsert() {
        if (!name) {
            name = "Anônimo"
        }
    }
}
