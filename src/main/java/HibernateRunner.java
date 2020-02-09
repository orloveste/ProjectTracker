import java.util.Objects;

public class HibernateRunner {
    public static void main(String[] args) {
        TypeService typeService = TypeService.getInstance();
        Type typeToUpdate = typeService.getType(1);
        typeToUpdate.nameType="bug";
        typeService.updateType(typeToUpdate); // update by id



        HibernateUtil.shutdown();
    }
}
/* CommentService commentService = CommentService.getInstance();
        System.out.println(commentService.getComment(1));*/ // find by ud comment