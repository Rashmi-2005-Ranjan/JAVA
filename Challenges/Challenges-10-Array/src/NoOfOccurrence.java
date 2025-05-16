import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoOfOccurrence {
    public static void main(String[] args) {
        List<Integer> arr = takeInputArray();
        System.out.println("Enter The Element To Count: ");
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        int count = countOccurrence(arr, element);
        System.out.println("The Element " + element + " Occurs " + count + " Times.");
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
    public static int countOccurrence(List<Integer>arr,int element){
        int count=0;
        for(int i=0;i<arr.size ();i++){
            if(arr.get ( i )==element){
                count++;
            }
        }
        return count;
    }
}
