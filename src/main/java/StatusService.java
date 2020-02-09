import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StatusService {
    private ProjectService projectService = ProjectService.getInstance();
    private static StatusService instance;
    private StatusService(){

    }
    public static StatusService getInstance(){
        if (instance == null){
            instance = new StatusService();
        }return instance;
    }
    public Status getStatusByIdProject(Integer idProject){
        Project project = projectService.getProject(idProject);
        return project.status;
    }
//    public List<Project> getStatusByIdProjects(Integer idStatus){
//        Status status = statusService.getStatus(idStatus);
//        return  status.projects;
//    }
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
    public Status createStatus (Status newStatus) {
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
        return newStatus;
    }
    public void updateStatus (Status modifStatus) {
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
    public void deleteStatus (Status trashStatus) {
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

