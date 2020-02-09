import org.hibernate.Session;

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
}
