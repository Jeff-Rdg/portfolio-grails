package portfolio.grails

class User {
    String name
    String email
    String password
    String bio

    static hasMany = [testimonials: Testimonial]
    static hasOne = [blogPost: BlogPost, certificate: Certificate, project: Project]

    static constraints = {
        name nullable: false, blank: false
        email nullable: false, blank: false, email: true
        password nullable: false, blank: false
        bio nullable: true, blank: true
        blogPost nullable: true
        certificate nullable: true
        project nullable: true
    }

    static mapping = {
        bio type: "text"
    }
}
