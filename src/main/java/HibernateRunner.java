public class HibernateRunner {
    public static void main(String[] args) {
       CommentService commentService = CommentService.getInstance();
        System.out.println(commentService.getComment(1));


        HibernateUtil.shutdown();
    }
}
