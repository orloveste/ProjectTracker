import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer commentId;
    String textComment;

    //Integer itemId;
    @ManyToOne
    @JoinColumn(name = "itemId")
    Item itemFromComment;

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", textComment='" + textComment + '\'' +
                ", itemFromComment=" + itemFromComment.titleItem +
                ", itemFromComment=" + itemFromComment.descriptionItem +
                '}';
    }
}
