import org.hibernate.Session;

public class ItemService {
    private static ItemService instance;
    private ItemService(){

    }
    public static ItemService getInstance(){
        if (instance == null){
            instance = new ItemService();
        }return instance;
    }
    public Item getItem(Integer itemId){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Item item = session.find(Item.class, itemId);
            return item;
        }catch (Exception exGetItem){
            exGetItem.printStackTrace();
            return null;
        }
    }
}
