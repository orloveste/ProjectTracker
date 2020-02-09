import javax.persistence.*;
import java.util.List;

@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idStatus;

    String nameStatus;

    /*@OneToMany
            (mappedBy = "status")
    List<Project> statusForProject;*/ //not needed for now = unidirectional

    @Override
    public String toString() {
        return "Status{" +
                "idStatus=" + idStatus +
                ", nameStatus='" + nameStatus + '\'' +
                /*", statusForProject=" + statusForProject +*/ //not needed for now = unidirectional
                '}';
    }
}
