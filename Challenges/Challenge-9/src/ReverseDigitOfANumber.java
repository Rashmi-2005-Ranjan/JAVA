import java.util.Scanner;

public class ReverseDigitOfANumber {
    public static void main(String[] args) {
        int num=readUserInput ();
        int reversedNumber=reverseDigits ( num );
        System.out.println ( "The reversed number is: " + reversedNumber );
    }
    public static void greet(){
        System.out.println ( "Welcome Digit Reversal" );
    }

    public static int readUserInput(){
        greet ();
        Scanner scanner = new Scanner ( System.in );
        System.out.print ( "Enter Number " );
        int n = scanner.nextInt ();
        return n;
    }
    public static int reverseDigits(int n){
        int newNumber=0;
        while(n>0){
            int lastDigit=n%10;
            newNumber=newNumber*10+lastDigit;
            n=n/10;
        }
        return newNumber;
    }
}
