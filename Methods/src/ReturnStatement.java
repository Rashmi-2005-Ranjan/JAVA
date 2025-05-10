import java.util.Scanner;

public class ReturnStatement {
    public static void main(String[] args) {
        calculateTwoNumbersAddition ( );
    }

    public static void greet() {
        System.out.println ( "Welcome To Calculator which Add Two Numbers" );
    }

    public static int addTwoNumber(int a , int b) {
        return a + b;
    }

    public static void calculateTwoNumbersAddition() {
        greet ();
        int a = readNumbers ( );
        int b = readNumbers ( );
        int result = addTwoNumber ( a , b );
        printResult ( result );
    }

    public static int readNumbers() {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter Number" );
        int a = sc.nextInt ( );
        return a;
    }

    public static void printResult(int result) {
        System.out.println ( "The Sum of Two Numbers is: " + result );
    }
}
