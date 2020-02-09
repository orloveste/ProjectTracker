public class HibernateRunner {
    public static void main(String[] args) {
       ItemService itemService = ItemService.getInstance();
        System.out.println(itemService.getItem(1));


        HibernateUtil.shutdown();
    }
}
