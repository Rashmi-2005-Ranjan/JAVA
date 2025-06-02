import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        int a=readUserInput ();
        int b=readUserInput ();
        int lcm=calcLCM ( a,b );
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
    public static int calcLCM(int a,int b){
        int i=1;
        while (i<=b){
            int factor=a*i;
            if(factor%b==0){
                return factor;
            }
            i++;
        }
        return 0; // This line will never be reached, but it's here to satisfy the method's return type
    }
}
