import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Type {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Integer idType;
    String nameType;

    @Override
    public String toString() {
        return "Type{" +
                "idType=" + idType +
                ", nameType='" + nameType + '\'' +
                '}';
    }
}
