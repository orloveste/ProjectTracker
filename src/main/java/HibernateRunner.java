import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Objects;

public class HibernateRunner {
    public static void main(String[] args) {

//        String hql = "from Type";
//        Query query = session.createQuery(hql);
//        List<Type> typeList = query.list();
//        for (Type aType : typeList){
//            System.out.println(aType.getType());
//        }

        HibernateUtil.shutdown();
    }
}
/*ItemService itemService = ItemService.getInstance();
        Item newItem = new Item();

        Status status = StatusService.getInstance().getStatus(6); //1to6
        Type type = TypeService.getInstance().getType(3); //1to3

        newItem.titleItem = "Action 6";
        newItem.descriptionItem = "any problem";
        newItem.statusFromItem = status;
        newItem.typeFromItem = type;
        itemService.createItem(newItem);
        System.out.println("Create new Item: "+newItem); //Create new Items in DB*/

/*ItemService itemService = ItemService.getInstance();

       Item itemByComment = itemService.getItemByCommentId(1);
       System.out.println(itemByComment);*/ // get item info by comment
 /*TypeService typeService = TypeService.getInstance();
        StatusService statusService = StatusService.getInstance();

        Status statusByIdItem = statusService.getStatusByIdItem(2);
        Type typeByIdItem = typeService.getTypeByIdItem(2);
        System.out.println("Type & Status by idItem: "+ typeByIdItem + statusByIdItem);*/ //get type and status from Item
/*StatusService statusService = StatusService.getInstance();
        Status status = statusService.getStatusByIdProject(5);
        System.out.println("Status for proj 5: "+status);

        status = statusService.getStatusByIdItem(2);
        System.out.println("Status for item: "+ status);*/ //get status by id item&Project
/*ProjectService projectService = ProjectService.getInstance();
        Project newProject = new Project();
        Status status = StatusService.getInstance().getStatus(2);

        newProject.nameProject = "My Project";
        newProject.shortNameProject = "Pr-4";
        newProject.descriptionProject = "add project for map";
        newProject.status = status;
        projectService.createProject(newProject);

        System.out.println(newProject);*/ //create new projects
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