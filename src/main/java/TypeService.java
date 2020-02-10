import org.hibernate.Session;
import org.hibernate.Transaction;

public class TypeService {
    private ItemService itemService = ItemService.getInstance();

    private static TypeService instance;
    private TypeService(){

    }
    public static TypeService getInstance(){
        if (instance == null){
            instance = new TypeService();
        } return instance;
    }

    public Type getTypeByIdItem(Integer idItem){
        Item item = itemService.getItem(idItem);
        return  item.typeFromItem;
    }

    public Type getType (Integer idType){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Type type = session.find(Type.class, idType);
            return type;
        }catch (Exception exGetType){
            exGetType.printStackTrace();
            return null;
        }
    }
    public void createType (Type newType) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(newType);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
    public Type updateType (Type modifType) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(modifType);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
        return null;
    }
    public void deleteType (Type trashType) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(trashType);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
}
