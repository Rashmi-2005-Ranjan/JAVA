import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num=readUserInput ();
        printMultiplicationTable ( num );
    }

    public static void printMultiplicationTable(int n) {
        greet ();
        System.out.println ( "Multiplication Table Of " + n + " is" );
        int result;
        for (int i = 1; i <= 10; i++) {
            result = n * i;
            System.out.println ( n + " * " + i + " = " + result );
        }
    }

    public static void greet(){
        System.out.println ( "Welcome Multiplication Table Calculator" );
    }

    public static int readUserInput(){
        Scanner scanner = new Scanner ( System.in );
        System.out.print ( "Enter a number to get its multiplication table: " );
        int n = scanner.nextInt ();
        return n;
    }
}