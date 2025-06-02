import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int a = readUserInput();
        int b = readUserInput();
        int gcd = calculateGCD(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);
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
        int i=2;
        int least=least(a,b);
        while (i<=least){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
