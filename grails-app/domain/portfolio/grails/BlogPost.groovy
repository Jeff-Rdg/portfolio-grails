package portfolio.grails

class BlogPost {
    String title
    String content
    Date date = new Date()
    User user

    static constraints = {
        title nullable: false, blank: false
        content nullable: false, blank: false
    }
}
