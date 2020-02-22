import java.util.Scanner;

public class Class_2020_02_22_Run {
    public static void main(String[] args) {
        printHelloText();

        System.out.println("Choose the option:");
        System.out.println("1 for Project");
        System.out.println("2 for Status of acction");
        System.out.println("3 for Type of acction");
        Scanner reader = new Scanner(System.in);
        int userChooseOption = reader.nextInt();


    }
    private static void printHelloText() {
        System.out.println("Hello in Project Controller!");
    }
}
