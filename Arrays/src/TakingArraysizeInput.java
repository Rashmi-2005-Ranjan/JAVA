import java.util.Scanner;

public class TakingArraysizeInput {
    public static void main(String[] args) {
        //Taking Array size Input from user
        System.out.print("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        // Declaring an Array
        int[] numbers= new int[size];
        // Taking Input
        for(int i=0;i<size;i++){
            numbers[i]=scanner.nextInt ();
        }
        // Printing an Array
        System.out.println("Array length: "+numbers.length);
        System.out.print("Array elements:");
        for(int i=0;i<size;i++){
            System.out.print (numbers[i]+" ");
        }
    }
}
