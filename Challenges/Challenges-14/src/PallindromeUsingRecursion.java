import java.util.Scanner;

public class PallindromeUsingRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        System.out.println ( "Welcome To Palindrome Checker" );
        System.out.print ( "Enter a string: " );
        String str = input.nextLine ( );
        if (isPalindrome ( str )) {
            System.out.println ( "The string is a palindrome." );
        } else {
            System.out.println ( "The string is not a palindrome." );
        }
    }

    public static boolean isPalindrome(String str) {
        if (str.length ( ) <= 1) {
            return true;
        }
        int lastPos = str.length ( ) - 1;
        if (str.charAt ( 0 ) != str.charAt ( lastPos )) {
            return false;
        } else {
            String newStr = str.substring ( /* Inclusive */1 ,/*Exclusive*/lastPos );
            return isPalindrome ( newStr );
        }
    }
}
