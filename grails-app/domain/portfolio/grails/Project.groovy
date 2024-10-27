package portfolio.grails

import javax.persistence.ElementCollection

class Project {
    String title
    String description
    String repositoryLink
    String demoLink
    @ElementCollection List<String> technologies

    static hasMany = [technologies: String]



    static constraints = {
        title nullable: false, blank: false
        description nullable: true, blank: true
        repositoryLink nullable: false, blank: false
        demoLink nullable: true, blank: true
        technologies nullable: true
    }

    static mapping = {
        technologies joinTable: false
    }
}
