import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        List<Integer> arr=takeInputArray ();
        sumAndAverage (arr);
    }
    public static void sumAndAverage(List<Integer> arr) {
        int sum=0;
        for(int i=0;i<arr.size ();i++){
            sum+=arr.get ( i );
        }
        double average=(double)sum/arr.size ();
        System.out.println ("Sum Of The Array: "+sum);
        System.out.println ("Average Of The Array: "+average);
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
}