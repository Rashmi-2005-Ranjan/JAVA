import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Welcome to the Factorial Calculator Using Recursion!" );
        System.out.print ( "Enter a number to calculate its factorial: " );
        int number = scanner.nextInt ( );
        long result = factorialUsingRecursion ( number );
        System.out.println ( "The factorial of " + number + "using recursion is: " + result );
        long iterativeResult = factorialUsingIteration ( number );
        System.out.println ( "The factorial of " + number + " using iteration is: " + iterativeResult );
    }

    public static long factorialUsingRecursion(int n) {
        //Base Case
        if (n == 0 || n == 1) {
            return 1;
        } else if (n < 0) {
            // Handle negative input
            System.out.println ( "Factorial is not defined for negative numbers." );
            throw new IllegalArgumentException ( "Negative input: " + n );
        } else {
            //Recursive Case
            return n * factorialUsingRecursion ( n - 1 );
        }
    }

    public static long factorialUsingIteration(int n) {
        if (n < 0) {
            System.out.println ( "Factorial is not defined for negative numbers." );
            throw new IllegalArgumentException ( "Negative input: " + n );
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
