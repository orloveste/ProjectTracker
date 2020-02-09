import org.hibernate.Session;
import org.hibernate.Transaction;

public class StatusService {
    private static StatusService instance;
    private StatusService(){

    }
    public static StatusService getInstance(){
        if (instance == null){
            instance = new StatusService();
        }return instance;
    }
    public Status getStatus (Integer idStatus){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Status status = session.find(Status.class, idStatus);
            return status;
        }catch (Exception exGetStatus){
            exGetStatus.printStackTrace();
            return null;
        }
    }
    public void createStatus (Comment newStatus) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(newStatus);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
    public void updateStatus (Comment modifStatus) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(modifStatus);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
    public void deleteStatus (Comment trashStatus) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(trashStatus);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
}

