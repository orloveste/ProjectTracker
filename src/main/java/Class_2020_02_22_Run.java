import java.util.Scanner;

public class Class_2020_02_22_Run {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        printHelloText();
        String enterProgram = reader.nextLine();

        System.out.println("Choose the option:");
        System.out.println("1 for Project");
        System.out.println("2 for Status of acction");
        System.out.println("3 for Type of acction");


        while (true){
            int userChooseOption = reader.nextInt();
            if (userChooseOption <= 0 || userChooseOption >= 4){
                System.out.println("Option is not valid");
                break;
            }
        }



    }
    private static void printHelloText() {
        System.out.println("Hello in Project Controller!");
    }
}
