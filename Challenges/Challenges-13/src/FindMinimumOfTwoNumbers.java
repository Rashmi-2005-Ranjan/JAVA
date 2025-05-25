import java.util.Scanner;

public class FindMinimumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Minimum Number Finder");
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        // Using ternary operator to find the minimum number
        int minimumNumber = num1 < num2 ? num1 : num2;
        System.out.println("The minimum number is: " + minimumNumber);
    }
}
