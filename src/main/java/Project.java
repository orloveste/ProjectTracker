import javax.persistence.*;

@Entity
public class Project {
    @Id
    @GeneratedValue
    Integer idProject;
    String nameProject;
    String shortNameProject;
    String descriptionProject;
    Integer idStatus;

    @ManyToOne
    @JoinColumn (name = "idStatus")
    Status statusForProject;

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
