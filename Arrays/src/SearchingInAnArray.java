import java.util.Scanner;

public class SearchingInAnArray {
    public static void main(String[] args) {
        System.out.println ("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt ();
        // Declaring an Array
        int[] numbers = new int[size];
        // Taking Input
        System.out.println ("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt ();
        }
        // Taking Search Element Input
        System.out.println ("Enter the element to search: ");
        int searchElement = scanner.nextInt ();
        // Searching the Element
        int index=searchKeyInAnrray(numbers,searchElement);
        // Printing the Result
        if(index==Integer.MIN_VALUE){
            System.out.println ("Element not found in the array");
        }else{
            System.out.println ("Element found at index: "+index);
        }
    }
    public static int searchKeyInAnrray(int[]numbers,int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }
}
