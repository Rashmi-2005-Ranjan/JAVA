import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        System.out.println ("Welcome To Merge Two Sorted Array" );
        System.out.println ( "Enter The First Sorted Array: " );
        int [] arr1 = takeInputArray ( );
        System.out.println ( "Enter The Second Sorted Array: " );
        int [] arr2 = takeInputArray ( );
        System.out.println ( "The First Sorted Array Is: " );
        printArray ( arr1 );
        System.out.println ( "The Second Sorted Array Is: " );
        printArray ( arr2 );
        int [] mergedArray = mergeSortedArrays ( arr1 , arr2 );
        System.out.println ( "The Merged Sorted Array Is: " );
        printArray ( mergedArray );
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

    public static int[] mergeSortedArrays(int[]arr1,int[]arr2){
        int newSize = arr1.length + arr2.length;
        int[] mergedArray = new int[newSize];
        int i = 0, j = 0, k = 0;
        while (i< arr1.length || j< arr2.length){
            if(j==arr2.length||(i<arr1.length && arr1[i] < arr2[j])){
                mergedArray[k]=arr1[i];
                i++;
                k++;
            }else {
                mergedArray[k]=arr2[j];
                j++;
                k++;
            }
        }
        return mergedArray;
    }
}
