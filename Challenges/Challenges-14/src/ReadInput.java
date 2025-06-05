import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Input Reader!");
        String input;
        while(true){
            System.out.println("Please enter a string (type 'exit' to quit):");
            input = scanner.nextLine();
            if(input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
            System.out.println("You entered: " + input);
        }
    }
}