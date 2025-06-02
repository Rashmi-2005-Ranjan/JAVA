import java.util.Scanner;

public class FibbonacciSeries {
    public static void main(String[] args) {
        int num=readUserInput ();
        printFibonacciSeries ( num );
    }
    public static void greet(){
        System.out.println ( "Welcome Fibbonacci Series Generator" );
    }

    public static int readUserInput(){
        greet ();
        Scanner scanner = new Scanner ( System.in );
        System.out.print ( "Enter Number Of Terms You Want to Print: " );
        int n = scanner.nextInt ();
        return n;
    }
    public static void printFibonacciSeries(int n){
        if(n<0){
            System.out.println ( "Please Enter A Positive Number" );
            return;
        }
        if(n==0 || n==1){
            System.out.println ( "Fibonacci Series Of " + n + " terms is" );
            return;
        }
        System.out.println ( "Fibonacci Series Of " + n + " terms is" );
        System.out.print ( "0 1 " );
        int first=0;
        int second=1;
        while (first+second<=n){
            int third=first+second;
            System.out.print ( third + " " );
            first=second;
            second=third;
        }
    }
}
