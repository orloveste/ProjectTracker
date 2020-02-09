import org.hibernate.Session;
import org.hibernate.Transaction;

public class CommentService {
    private static CommentService instance;
    private CommentService(){

    }
    public static CommentService getInstance(){
        if (instance == null){
            instance = new CommentService();
        }return instance;
    }
    public Comment getComment(Integer commentId){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Comment comment = session.find(Comment.class, commentId);
            return comment;
        }catch (Exception exGetCpomment){
            exGetCpomment.printStackTrace();
            return null;
        }
    }
    public Comment createComment (Comment newComment) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(newComment);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        } return newComment;
    }
    public Comment updateComment (Comment modifComment) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(modifComment);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
        return null;
    }
    public void deleteComment (Comment trashComment) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(trashComment);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
}
