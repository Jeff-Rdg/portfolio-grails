package portfolio.grails

class Project {
    String title
    String description
    String repositoryLink
    String demoLink
    User user
    String technologies

    static constraints = {
        title nullable: false, blank: false
        description nullable: true, blank: true
        repositoryLink nullable: false, blank: false
        demoLink nullable: true, blank: true
        technologies nullable: true
    }
}
