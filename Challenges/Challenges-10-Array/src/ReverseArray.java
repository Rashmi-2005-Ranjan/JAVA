import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        List<Integer>arr = takeInputArray();
        System.out.println("The Original Array Is: ");
        printArray(arr);
        reverseArray(arr);
        System.out.println("The Reversed Array Is: ");
        printArray(arr);
    }

    public static List<Integer> takeInputArray() {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter The Size Of The Array: " );
        int size = sc.nextInt ( );
        List<Integer> arr = new ArrayList<> ( );
        System.out.println ( "Enter The Elements Of The Array: " );
        for (int i = 0; i < size; i++) {
            arr.add ( sc.nextInt ( ) );
        }
        return arr;
    }

    public static void printArray(List<Integer> arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void reverseArray(List<Integer>arr){
        int start=0;
        int end=arr.size()-1;
        while (start<end){
            Collections.swap ( arr,start,end );
            start++;
            end--;
        }
    }
}
