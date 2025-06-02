import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = readUserInput();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }

    public static void greet(){
        System.out.println ( "Welcome  To Armstrong Number Checker" );
    }

    public static int readUserInput(){
        greet ();
        Scanner scanner = new Scanner ( System.in );
        System.out.print ( "Enter Number Of Terms You Want to Print: " );
        int n = scanner.nextInt ();
        return n;
    }
    public static boolean isArmstrong(int n){
        int originalNumber=n;
        int sum=0;
        int digit;
        while (n>0){
            digit=n%10;
            sum+=digit*digit*digit;
            n=n/10;
        }
        if(sum==originalNumber) {
            return true;
        }
        else {
            return false;
        }
    }
}
