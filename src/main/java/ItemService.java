import org.hibernate.Session;
import org.hibernate.Transaction;

public class ItemService {
    CommentService commentService = CommentService.getInstance();

    private static ItemService instance;
    private ItemService(){

    }
    public static ItemService getInstance(){
        if (instance == null){
            instance = new ItemService();
        }return instance;
    }

    public  Item getItemByCommentId(Integer commentId){
        Comment comment = commentService.getComment(commentId);
        return comment.itemFromComment;
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
    public Item createItem (Item newItem) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(newItem);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        } return newItem;
    }
    public Item updateItem (Item modifItem) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(modifItem);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
        return null;
    }
    public void deleteItem (Item trashItem) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(trashItem);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
}
