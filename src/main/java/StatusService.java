import org.hibernate.Session;

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
}
