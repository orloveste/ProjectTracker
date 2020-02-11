import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class HQL_Examples {
    @SuppressWarnings("Unchecked")
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Comment");
        List<Comment> commmentList = query.list();
        for (Comment textComment : commmentList){
            System.out.println("List of comments::"+ textComment.commentId +", "+textComment.textComment);
        } tx.rollback();
        sessionFactory.close();
    }
}
