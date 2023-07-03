import java.util.Scanner;

public class UserInterface {
    public static void dataEntry() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter user data in the following format:");
        System.out.println("Last_Name First_Name Middle_Name date_of_birth phone_number gender");
        System.out.println("gender - single character 'f' or 'm'");
        System.out.println("date_of_birth - format dd.MM.yyyy");
        System.out.println("phone_number - format 79999999999");
        System.out.println("Or enter 'exit' to exit");
        boolean running = true;
        while (running) {
            String[] input = in.nextLine().split(" ");
            if (input[0].equalsIgnoreCase("exit")) {
                break;
            }
            MessageHandler.processEnteredData(input);
        }
    }
}