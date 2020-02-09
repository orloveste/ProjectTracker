import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Project {
    @Id
    @GeneratedValue
    Integer idProject;
    String nameProject;
    String shortNameProject;
    String descriptionProject;
    Integer idStatus;

    @Override
    public String toString() {
        return "Project{" +
                "idProject=" + idProject +
                ", nameProject='" + nameProject + '\'' +
                ", shortNameProject='" + shortNameProject + '\'' +
                ", descriptionProject='" + descriptionProject + '\'' +
                ", idStatus=" + idStatus +
                '}';
    }
}
