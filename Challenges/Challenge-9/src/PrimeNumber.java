import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=readUserInput ();
        boolean isPrime=isPrime ( num );
        if(isPrime){
            System.out.println ( num + " is a prime number" );
        }else{
            System.out.println ( num + " is not a prime number" );
        }
    }
    public static void greet(){
        System.out.println ( "Welcome To Prime Number Calculator" );
    }

    public static int readUserInput(){
        greet ();
        Scanner scanner = new Scanner ( System.in );
        System.out.print ( "Enter Number " );
        int n = scanner.nextInt ();
        return n;
    }
    public static boolean isPrime(int n){
        if (n < 1) {
            return false;
        } else if (n == 0) {
            return false;
        } else if (n == 1) {
            return false;
        }else if (n == 2) {
            return true;
        }

        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
