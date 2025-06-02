import java.util.Scanner;

public class GreatestCommonDivisorOfTwoIntegers {
    public static void main(String[] args) {
        int a=readUserInput ();
        int b=readUserInput ();
        int gcd=calculateGCD ( a,b );
        System.out.println ( "The GCD of " + a + " and " + b + " is: " + gcd );
    }
    public static void greet(){
        System.out.println ( "Welcome LCM Of Two numbers Calculator" );
    }

    public static int readUserInput(){
        greet ();
        Scanner scanner = new Scanner ( System.in );
        System.out.print ( "Enter Number " );
        int n = scanner.nextInt ();
        return n;
    }
    public static int calculateGCD(int a,int b){
        int gcd=1;
        for(int i=2;i<=a || i<=b;i++){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return gcd;
    }
}


