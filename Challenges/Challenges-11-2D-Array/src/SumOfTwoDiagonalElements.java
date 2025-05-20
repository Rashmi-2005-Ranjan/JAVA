import java.util.Scanner;

public class SumOfTwoDiagonalElements {
    public static void main(String[] args) {
        System.out.println ( "Welcome To Sum Of Two Diagonal Elements Of 2D Array" );
        int[][] arr = takeInputArray();
        System.out.println ( "The 2D Array Is: " );
        printArray(arr);
        long sum = calculateDiagonalSum(arr);
        System.out.println ( "The Sum Of The Two Diagonal Elements Is: " + sum );
    }

    public static int[][] takeInputArray() {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter Square Matrix Always" );
        System.out.println ( "Enter The Number Of Rows: " );
        int rows = sc.nextInt ( );
        System.out.println ( "Enter The Number Of Columns: " );
        int cols = sc.nextInt ( );
        int[][] arr = new int[rows][cols];
        System.out.println ( "Enter The Elements Of The Array: " );
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt ( );
            }
        }
        return arr;
    }

    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print ( element + " " );
            }
            System.out.println ( );
        }
    }

    public static long calculateDiagonalSum(int[][]arr){
        long leftDiagonalSum = calculateLeftDiagonalSum(arr);
        long rightDiagonalSum = calculateRightDiagonalSum(arr);
        long totalSum = leftDiagonalSum + rightDiagonalSum;
        if (arr.length % 2 != 0) {
            int midIndex = arr.length / 2;
            totalSum -= arr[midIndex][midIndex]; // Subtract the middle element if the matrix is odd-sized
        }
        return totalSum;
    }

    public static long calculateLeftDiagonalSum(int[][]arr){
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i]; // Left diagonal elements
        }
        return sum;
    }

    public static long calculateRightDiagonalSum(int[][]arr){
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][arr.length - 1 - i]; // Right diagonal elements
        }
        return sum;
    }
}
