import java.util.Objects;

public class HibernateRunner {
    public static void main(String[] args) {
        ProjectService projectService = ProjectService.getInstance();
        Project projectToUpdate = projectService.getProject(1);
        projectToUpdate.nameProject = "First Project update";
        projectService.updateProject(projectToUpdate);



        HibernateUtil.shutdown();
    }
}
/*TypeService typeService = TypeService.getInstance();
        Type typeToUpdate = typeService.getType(1);
        typeToUpdate.nameType="bug";
        typeService.updateType(typeToUpdate);*/ // update by id
/* CommentService commentService = CommentService.getInstance();
        System.out.println(commentService.getComment(1));*/ // find by ud comment