public class HibernateRunner {
    public static void main(String[] args) {
        StatusService statusService = StatusService.getInstance();
        System.out.println(statusService.getStatus(1));


        HibernateUtil.shutdown();
    }
}
