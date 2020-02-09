import java.util.Objects;

public class HibernateRunner {
    public static void main(String[] args) {
        ProjectService projectService = ProjectService.getInstance();
        Project newProject = new Project();
        Status status = StatusService.getInstance().getStatus(2);

        newProject.nameProject = "My Project";
        newProject.shortNameProject = "Pr-4";
        newProject.descriptionProject = "add project for map";
        newProject.status = status;
        projectService.createProject(newProject);

        System.out.println(newProject);





        HibernateUtil.shutdown();
    }
}
/*StatusService statusService = StatusService.getInstance();

        Status newStatus = new Status();
        newStatus.nameStatus = "Closed";
        statusService.createStatus(newStatus);

        Status newStatus1 = new Status();
        newStatus1.nameStatus = "Suspended";
        statusService.createStatus(newStatus1);

        Status newStatus2 = new Status();
        newStatus2.nameStatus = "Delayed";
        statusService.createStatus(newStatus2);

        Status newStatus3 = new Status();
        newStatus3.nameStatus = "Offered";
        statusService.createStatus(newStatus3);

        Status newStatus4 = new Status();
        newStatus4.nameStatus = "ReOffered";
        statusService.createStatus(newStatus4);*/ // create new status
/*ProjectService projectService = ProjectService.getInstance();
        Project projectToUpdate = projectService.getProject(1);
        projectToUpdate.nameProject = "First Project update";
        projectService.updateProject(projectToUpdate);*/ //update project DB
/*TypeService typeService = TypeService.getInstance();
        Type typeToUpdate = typeService.getType(1);
        typeToUpdate.nameType="bug";
        typeService.updateType(typeToUpdate);*/ // update by id
/* CommentService commentService = CommentService.getInstance();
        System.out.println(commentService.getComment(1));*/ // find by ud comment