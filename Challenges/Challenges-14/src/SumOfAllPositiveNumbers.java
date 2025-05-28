import java.util.Scanner;

public class SumOfAllPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Welcome to the Sum of All Positive Numbers Calculator!" );
        System.out.println ( "Please enter the size of the array:" );
        int size = scanner.nextInt ( );
        int[] numbers = new int[size];
        System.out.println ( "Enter the elements of the array:" );
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt ( );
        }
        int sum = calculateSumOfPositiveNumbers ( numbers );
        System.out.println ( "The sum of all positive numbers in the array is: " + sum );
    }

    private static int calculateSumOfPositiveNumbers(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num < 0) {
                continue;
            } else {
                sum += num;
            }
        }
        return sum;
    }
}
