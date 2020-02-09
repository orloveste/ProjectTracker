public class HibernateRunner {
    public static void main(String[] args) {
        ProjectService projectService = ProjectService.getInstance();
        System.out.println(projectService.getProject(1));


        HibernateUtil.shutdown();
    }
}
