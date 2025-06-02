import java.util.List;
import java.util.Scanner;

public class LeastCommonMultipleOfTwoNumbers {
    public static void main(String[] args) {
        int a=readUserInput ();
        int b=readUserInput ();
        int lcm=calculateLCM ( a,b );
        System.out.println ( "The LCM of " + a + " and " + b + " is: " + lcm );
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
    public static int calculateLCM(int a, int b) {
        int num=a*b;
        for(int i=1;i<=num;i++){
            if(i%a==0 && i%b==0){
                return i;
            }
        }
        return num;
    }
}
