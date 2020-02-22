import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

public class Class_2020_02_22_Run {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        Scanner reader = new Scanner(System.in);
        printHelloText();
        String enterProgram = reader.nextLine();

        while (true){
            printFrontMenu();
            int userChooseOption = reader.nextInt();
            if (userChooseOption <= 0 || userChooseOption >= 4){
                System.out.println("Option is not valid");
                break;
            }
            else if (userChooseOption == 1){
                printProjectMenu();
                userChooseOption = reader.nextInt();
                if (userChooseOption < 0 || userChooseOption >2){
                    System.out.println("Option is not valid");
                    break;
                }
                else if (userChooseOption == 1){
                    Transaction tx = session.beginTransaction();
                    Query query = session.createQuery("from Project");
                    List<Project> projectList = query.list();
                    for (Project textProject : projectList){
                        System.out.println("List of projects::"+ textProject.idProject +", "+textProject.nameProject);
                    } tx.rollback();
                    sessionFactory.close();
                }else if (userChooseOption == 2){
                    Transaction tx = session.beginTransaction();
                    Query query = session.createQuery("from Project");
                    List<Project> projectList = query.list();
                    for (Project textProject : projectList){
                        System.out.println("List of projects::"+ textProject.status +", "+ textProject.idProject
                                +", "+textProject.nameProject);
                    } tx.rollback();
                    sessionFactory.close();
                } else {
                    printFrontMenu();
                }
            }
            else if (userChooseOption == 2){
                printStatusMenu();
                userChooseOption = reader.nextInt();
                if (userChooseOption < 0 || userChooseOption >1){
                    System.out.println("Option is not valid");
                    break;
                }
                else if (userChooseOption == 1){
                    Transaction tx = session.beginTransaction();
                    Query query = session.createQuery("from Status");
                    List<Status> statusList = query.list();
                    for (Status textStatus : statusList){
                        System.out.println("List of statuses::"+ textStatus.idStatus +", "+ textStatus.nameStatus);
                    } tx.rollback();
                    sessionFactory.close();
                } else {
                    printFrontMenu();
                }

            }else if (userChooseOption == 3){
                printTypeMenu();

            }
        }
    }
    private static void printHelloText() {
        System.out.println("Hello in Project Controller!");
    }
    private static void printFrontMenu() {
        System.out.println("*\nFront menu - Choose the option:");
        System.out.println("1 for Project"); //done
        System.out.println("2 for Status of acction"); //done
        System.out.println("3 for Type of acction"); //done
    }
    private static void printProjectMenu() {
        System.out.println("**\nProject menu - Choose the option:");
        System.out.println("1 for List of Project"); //done
        System.out.println("2 for Status of Projects"); //done
        //can be submenu
//        System.out.println("3 for Items of acction in Projects");
//        System.out.println("4 for Type of acction in Projects");
        System.out.println("0 for back in Front Menu"); //ok
    }
    private static void printStatusMenu() {
        System.out.println("**\nStatus menu - Choose the option:");
        System.out.println("1 for List of Statuses"); //done
        System.out.println("0 for back in Front Menu"); //ok
    }
    private static void printTypeMenu() {
        System.out.println("**\nType menu - Choose the option:");
        System.out.println("1 for List of Type"); // TODO: 22-Feb-20
        System.out.println("0 for back in Front Menu");
    }
}
