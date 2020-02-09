public class HibernateRunner {
    public static void main(String[] args) {
        TypeService typeService = TypeService.getInstance();
        System.out.println(typeService.getType(1));


        HibernateUtil.shutdown();
    }
}
