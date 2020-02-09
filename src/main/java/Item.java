import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
    @GeneratedValue
    Integer itemId;
    String titleItem;
    String descriptionItem;
    Integer idStatus;
    Integer idType;

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", titleItem='" + titleItem + '\'' +
                ", descriptionItem='" + descriptionItem + '\'' +
                ", idStatus=" + idStatus +
                ", idType=" + idType +
                '}';
    }
}
