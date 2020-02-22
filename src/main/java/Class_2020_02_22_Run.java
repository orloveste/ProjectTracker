import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

public class Class_2020_02_22_Run {
    public static void main(String[] args) {
//        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Scanner reader = new Scanner(System.in);
        printHelloText();
        String begin_endProgram = reader.nextLine();

        while (true){

            printFrontMenu();
            int userChooseOption = reader.nextInt();
            //int userChooseOption = reader.nextInt(begin_endProgram.compareToIgnoreCase("quit"));
            //nextInt();
           //int x = reader.nextInt();
//            begin_endProgram = Integer.parseInt("quit");
//            int userChooseOption = Integer.parseInt(reader.nextLine());
//            if (userChooseOption == begin_endProgram) {
//                System.exit(9);
//            }else

            //readOption(Scanner s);
            //String line = s.readLine();
            //if line = "quit" : System.exit();
            //} else Integer.RarseInt;
            //if (userChooseOption = "quit")



//            if (begin_endProgram.equalsIgnoreCase("quit")){ //todo quit option
//                System.out.println("Thank you for using our program! \n* Have a nice day *:)*");
//                break;
//            }

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
                    try {
                        Session session = HibernateUtil.getSessionFactory().openSession();

                        Query query = session.createQuery("from Project");
                        List<Project> projectList = query.list();
                        for (Project textProject : projectList) {
                            System.out.println("List of projects::" + textProject.idProject + ", " + textProject.nameProject);
                        }
                        session.close();

                    }catch (Exception ex){
                        ex.printStackTrace();
                        return;
                    }
                }else if (userChooseOption == 2){
                    try{
                    Session session = HibernateUtil.getSessionFactory().openSession();

                    Query query = session.createQuery("from Project");
                    List<Project> projectList = query.list();
                    for (Project textProject : projectList){
                        System.out.println("List of projects::"+ textProject.status +", "+ textProject.idProject
                                +", "+textProject.nameProject);
                    }
                    session.close();
                    }catch (Exception ex){
                        ex.printStackTrace();
                        return;
                    }
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
                    try{
                    Session session = HibernateUtil.getSessionFactory().openSession();

                    Query query = session.createQuery("from Status");
                    List<Status> statusList = query.list();
                    for (Status textStatus : statusList){
                        System.out.println("List of statuses::"+ textStatus.idStatus +", "+ textStatus.nameStatus);
                    }
                    session.close();
                    }catch (Exception ex){
                        ex.printStackTrace();
                        return;
                    }
                } else {
                    printFrontMenu();
                }

            }else if (userChooseOption == 3){
                printTypeMenu();
                userChooseOption = reader.nextInt();
                if (userChooseOption < 0 || userChooseOption >1){
                    System.out.println("Option is not valid");
                    break;
                }
                else if (userChooseOption == 1){
                    try{
                    Session session = HibernateUtil.getSessionFactory().openSession();

                    Query query = session.createQuery("from Type");
                    List<Type> typeList = query.list();
                    for (Type textType : typeList){
                        System.out.println("List of types::"+ textType.idType +", "+ textType.nameType);
                    }
                    session.close();
                    }catch (Exception ex){
                        ex.printStackTrace();
                        return;
                    }
                } else {
                    printFrontMenu();
                }
            }

        }
        //HibernateUtil.shutdown();
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
        System.out.println("1 for List of Type"); // done
        System.out.println("0 for back in Front Menu"); //ok
    }
}
//Exception in thread "main" java.lang.IllegalStateException: Session/EntityManager is closed
//	at org.hibernate.internal.AbstractSharedSessionContract.checkOpen(AbstractSharedSessionContract.java:360)
//	at org.hibernate.engine.spi.SharedSessionContractImplementor.checkOpen(SharedSessionContractImplementor.java:139)
//	at org.hibernate.internal.AbstractSharedSessionContract.beginTransaction(AbstractSharedSessionContract.java:465)
//	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
//	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//	at java.lang.reflect.Method.invoke(Method.java:498)
//	at org.hibernate.context.internal.ThreadLocalSessionContext$TransactionProtectionWrapper.invoke(ThreadLocalSessionContext.java:350)
//	at com.sun.proxy.$Proxy17.beginTransaction(Unknown Source)
//	at Class_2020_02_22_Run.main(Class_2020_02_22_Run.java:41)