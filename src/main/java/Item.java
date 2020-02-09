import javax.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer itemId;
    String titleItem;
    String descriptionItem;

//    Integer idStatus;
    @ManyToOne
    @JoinColumn (name = "idStatus")
    Status statusFromItem;
//    Integer idType;
    @ManyToOne
    @JoinColumn(name = "idType")
    Type typeFromItem;


    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", titleItem='" + titleItem + '\'' +
                ", descriptionItem='" + descriptionItem + '\'' +
                ", statusFromItem=" + statusFromItem.nameStatus +
                ", typeFromItem=" + typeFromItem.nameType +
                '}';
    }
}
