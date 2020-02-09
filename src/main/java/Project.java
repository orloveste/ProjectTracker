import javax.persistence.*;
import java.util.List;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idProject;

    String nameProject;
    String shortNameProject;
    String descriptionProject;



    @ManyToOne
    @JoinColumn (name = "idStatus")
    Status status;

    @Override
    public String toString() {
        return "Project{" +
                "idProject=" + idProject +
                ", nameProject='" + nameProject + '\'' +
                ", shortNameProject='" + shortNameProject + '\'' +
                ", descriptionProject='" + descriptionProject + '\'' +
                ", idStatus=" + status.idStatus +
                '}';
    }
}
