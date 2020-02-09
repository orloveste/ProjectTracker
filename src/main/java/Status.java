import javax.persistence.*;
import java.util.List;

@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idStatus;

    String nameStatus;

    @OneToMany
            (mappedBy = "status")
    List<Project> statusForProject;

    @Override
    public String toString() {
        return "Status{" +
                "idStatus=" + idStatus +
                ", nameStatus='" + nameStatus + '\'' +
                ", statusForProject=" + statusForProject +
                '}';
    }
}
