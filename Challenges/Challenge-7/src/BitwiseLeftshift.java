import java.util.Scanner;

public class BitwiseLeftshift {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner (System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter Number");
        int a = sc.nextInt();

        // Prompt the user to enter the second number
        System.out.println("Enter How Many Times To Shift");
        int b = sc.nextInt();

        // Perform bitwise left shift operation and print the result
        System.out.println("Bitwise Left Shift of " + a + " and " + b + " is: " + (a << b));
    }
}
