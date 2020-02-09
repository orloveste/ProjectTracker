import org.hibernate.Session;

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
}
