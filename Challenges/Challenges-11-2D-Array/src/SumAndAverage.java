import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        System.out.println ( "Welcome To Sum And Average Of 2D Array" );
        int[][] arr = takeInputArray();
        System.out.println ( "The 2D Array Is: " );
        printArray(arr);
        int sum = calculateSum(arr);
        double average = calculateAverage(arr);
        System.out.println ( "The Sum Of The 2D Array Is: " + sum );
        System.out.println ( "The Average Of The 2D Array Is: " + average );
    }

    public static int[][] takeInputArray() {
        Scanner sc = new Scanner ( System.in );
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

    public static int calculateSum(int[][]arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static double calculateAverage(int[][]arr){
        int sum=calculateSum(arr);
        int totalElements=0;
        for (int i=0;i<arr.length;i++){
            totalElements+=arr[i].length;
        }
        double average=(double)sum/totalElements;
        return average;
    }

}
