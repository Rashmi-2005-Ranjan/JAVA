import java.util.Scanner;

public class BitwiseRightshift {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner (System.in);

        // Prompt the user for the first number
        System.out.println("Enter First Number");
        int a = sc.nextInt();

        // Prompt the user for the second number
        System.out.println("Enter The Number Of Times To Shift");
        int b = sc.nextInt();

        // Perform bitwise right shift operation and print the result
        System.out.println("Bitwise Right Shift of " + a + " and " + b + " is: " + (a >> b));
    }
}
