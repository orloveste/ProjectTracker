import org.hibernate.Session;

public class TypeService {
    private static TypeService instance;
    private TypeService(){

    }
    public static TypeService getInstance(){
        if (instance == null){
            instance = new TypeService();
        } return instance;
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
}
