import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num=readUserInput ();
        boolean isPalindrome=isPalindrome ( num );
        if(isPalindrome){
            System.out.println ( num + " is a palindrome number" );
        }else{
            System.out.println ( num + " is not a palindrome number" );
        }
    }
    public static void greet(){
        System.out.println ( "Welcome To Palindrome Number Checker" );
    }
    public static int readUserInput(){
        greet ();
        Scanner scanner = new Scanner ( System.in );
        System.out.print ( "Enter Number " );
        int n = scanner.nextInt ();
        return n;
    }
    public static boolean isPalindrome(int n){
        int reversedNumber=reverseDigits ( n );
        if(n==reversedNumber){
            return true;
        }else{
            return false;
        }
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
