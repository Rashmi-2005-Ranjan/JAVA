import java.util.Scanner;

public class MonthOfTheYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Month of the Year Checker");
        System.out.print("Enter a number (1-12): ");
        int monthNumber = input.nextInt();

        // Using the new switch statement
        newSwitch (monthNumber);
        // Using the older switch statement
        oldSwitch(monthNumber);
    }

    public static void newSwitch(int monthNumber) {
        String month = switch (monthNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month number. Please enter a number between 1 and 12.";
        };
        System.out.println("The month is: " + month);
    }
    //Using Older Switch Statement
    public static void oldSwitch(int monthNumber) {
        String month;
        switch (monthNumber) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
            default:
                month = "Invalid month number. Please enter a number between 1 and 12.";
        }
        System.out.println("The month is: " + month);
    }
}
