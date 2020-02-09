import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer commentId;
    String textComment;
    Integer itemId;

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", textComment='" + textComment + '\'' +
                ", itemId=" + itemId +
                '}';
    }
}
