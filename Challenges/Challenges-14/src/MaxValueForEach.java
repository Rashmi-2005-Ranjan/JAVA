import java.util.Scanner;

public class MaxValueForEach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Welcome to the Max Value Finder!");
        int size;
        System.out.println ("Please enter the size of the array:");
        size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println ("Enter The elements Of The Array: " );
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        int maxValue = findMaxValue(numbers);
        System.out.println("The maximum value in the array is: " + maxValue);
    }
    public static int findMaxValue(int[]arr){
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        return max;
    }
}
