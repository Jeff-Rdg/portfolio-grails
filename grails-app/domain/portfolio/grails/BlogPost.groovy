package portfolio.grails

class BlogPost {
    String title
    String content
    Date date = new Date()

    static hasOne = [user: User]

    static constraints = {
        title nullable: false, blank: false
        content nullable: false, blank: false
    }
}
