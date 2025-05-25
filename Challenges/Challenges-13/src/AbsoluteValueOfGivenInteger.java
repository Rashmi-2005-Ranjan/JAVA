import java.util.Scanner;

public class AbsoluteValueOfGivenInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Absolute Value Calculator");
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        // Using ternary operator to calculate the absolute value
        int absoluteValue = number < 0 ? -number : number;
        System.out.println("The absolute value of " + number + " is: " + absoluteValue);
    }
}
