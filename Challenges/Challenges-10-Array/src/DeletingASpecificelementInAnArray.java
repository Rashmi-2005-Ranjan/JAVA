import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeletingASpecificelementInAnArray {
    public static void main(String[] args) {
        List<Integer> arr = takeInputArray ( );
        System.out.println ( "Enter The Element You Want To Delete: " );
        Scanner sc = new Scanner ( System.in );
        int element = sc.nextInt ( );
        if (arr.contains ( element )) {
            List<Integer> newArr = removeElement ( arr , element );
            System.out.println ( "The New Array After Deleting The Element Is: " );
            for (int i : newArr) {
                System.out.print ( i + " " );
            }
        } else {
            System.out.println ( "Element Not Found In The Array" );
        }
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

    public static List<Integer> removeElement(List<Integer> arr , int element) {
        List<Integer> newArr = new ArrayList<> ( );
        for (int i = 0; i < arr.size ( ); i++) {
            if (arr.get ( i ) != element) {
                newArr.add ( arr.get ( i ) );
            }
        }
        return newArr;
    }
}
