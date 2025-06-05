import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Welcome to the Fibonacci Series Generator!" );
        System.out.println ( "Please enter the number of terms in the Fibonacci series:" );
        int terms = scanner.nextInt ( );
        for (int i = 1; i <= terms; i++) {
            System.out.println ( generateFibonacciSeries ( i ) + " " );
        }
    }

    private static int generateFibonacciSeries(int terms) {
        System.out.print ("*(Recursive Call)*  " );
        // Base cases
        if (terms == 1) {
            return 0;
        }
        if (terms == 2) {
            return 1;
        } else {
            return generateFibonacciSeries ( terms - 1 ) + generateFibonacciSeries ( terms - 2 );
        }
    }
}
