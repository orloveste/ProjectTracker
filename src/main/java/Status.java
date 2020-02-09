import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Status {
    @Id
    @GeneratedValue
    //Integer idStatus;

    String nameStatus;

    @OneToMany (mappedBy = "statusForProject")
    List<Project> projects;

    @Override
    public String toString() {
        return "Status{" +
                "nameStatus='" + nameStatus + '\'' +
                ", projects=" + projects +
                '}';
    }
}
