import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ProjectService {

    private static ProjectService instance;
    private ProjectService(){

    }
    public static ProjectService getInstance(){
        if (instance == null){
            instance = new ProjectService();
        }return instance;
    }



    public Project getProject(Integer idProject){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Project project = session.find(Project.class, idProject);
            return  project;
        }catch (Exception exGetProject){
            exGetProject.printStackTrace();
            return null;
        }
    }
    public void createProject (Comment newProject) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(newProject);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
    public Project updateProject (Project modifProject) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(modifProject);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
        return null;
    }
    public void deleteProject (Comment trashProject) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(trashProject);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
}
