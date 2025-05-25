import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Day of the Week Checker");
        System.out.print("Enter a number (1-7) for the day of the week: ");
        int day = input.nextInt (); // Example day of the week (1-7)

        String dayName=switch (day) {
            case 1 ->  "Monday";
            case 2 ->  "Tuesday";
            case 3 ->  "Wednesday";
            case 4 ->  "Thursday";
            case 5 ->  "Friday";
            case 6 ->  "Saturday";
            case 7 ->  "Sunday";
            case 8, 9, 10 -> "Invalid day"; // Example of handling multiple cases
            default -> "Invalid day";
        };
        System.out.println("The day is: " + dayName);
    }
}
