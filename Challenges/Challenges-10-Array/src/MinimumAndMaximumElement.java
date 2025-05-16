import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinimumAndMaximumElement {
    public static void main(String[] args) {
        List<Integer> arr = takeInputArray();
        int min = findMinimum(arr);
        int max = findMaximum(arr);
        System.out.println("Minimum Element: " + min);
        System.out.println("Maximum Element: " + max);
    }
    public static List<Integer> takeInputArray(){
        Scanner sc=new Scanner ( System.in );
        System.out.println ("Enter The Size Of The Array: " );
        int size=sc.nextInt ();
        List<Integer> arr=new ArrayList<> ();
        System.out.println ("Enter The Elements Of The Array: " );
        for (int i=0; i<size; i++) {
            arr.add (sc.nextInt ());
        }
        return arr;
    }
    public static int findMaximum(List<Integer>arr){
        int max=0;
        for(int i=0;i<arr.size ();i++){
            if(arr.get ( i )>max){
                max=arr.get ( i );
            }
        }
        return max;
    }
    public static int findMinimum(List<Integer>arr) {
        //Sort the array in ascending order
        Collections.sort ( arr );
        //Get the first element of the sorted array
        return arr.get ( 0 );
    }
}
