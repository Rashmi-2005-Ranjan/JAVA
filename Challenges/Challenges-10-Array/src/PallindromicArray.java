import java.util.Scanner;

public class PallindromicArray {
    public static void main(String[] args) {
        System.out.println ("Welcome To Palindrome Checker" );
        int[] numArr= takeInputArray ( );
        System.out.println ( "The Original Array Is: " );
        printArray ( numArr );
        boolean isPalindrome = checkPalindrome ( numArr );
        if (isPalindrome) {
            System.out.println ( "The Array Is A Palindrome" );
        } else {
            System.out.println ( "The Array Is Not A Palindrome" );
        }
    }
    public static int[] takeInputArray(){
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter The Size Of The Array: " );
        int size = sc.nextInt ( );
        int[] arr = new int[size];
        System.out.println ( "Enter The Elements Of The Array: " );
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt ( );
        }
        return arr;
    }

    public static void printArray(int[]arr){
        for (int i : arr) {
            System.out.print ( i + " " );
        }
        System.out.println ( );
    }

    public static boolean checkPalindrome(int[]arr){
        // Two Pointers Approach
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                // Not a palindrome
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
