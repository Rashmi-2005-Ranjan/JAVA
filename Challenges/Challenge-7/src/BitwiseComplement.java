import java.util.Scanner;

public class BitwiseComplement {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner (System.in);

        // Prompt the user for input
        System.out.println("Enter a number:");

        // Read the integer input from the user
        int n = sc.nextInt();

        // Calculate the bitwise complement of the number
        int complement = ~n;

        // Print the result
        System.out.println("Bitwise complement of " + n + " is: " + complement);
    }
}
