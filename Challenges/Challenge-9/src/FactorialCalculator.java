import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        int num=readInput ();
        calculateFactorial ( num );
    }

    public static void calculateFactorial(int number){
        int prod=1;
        for(int i=number;i>=1;i--){
            prod*=i;
        }
        System.out.println("The factorial of " + number + " is: " + prod);
    }

    public static int readInput(){
        greet ();
        Scanner sc=new Scanner ( System.in );
        System.out.println ( "Enter a number to get the factorial of that number: " );
        int num=sc.nextInt ();
        return num;
    }

    public static void greet(){
        System.out.println ( "Welcome To Factorial Calculator" );
    }
}
