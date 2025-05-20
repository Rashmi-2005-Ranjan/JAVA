import java.util.Scanner;

public class SearchingIn2DArray {
    public static void main(String[] args) {
        int[][] arr= takeInputArray();
        System.out.println ( "Enter The Element You Want To Search: " );
        Scanner sc = new Scanner ( System.in );
        int element = sc.nextInt ( );
        searchElement ( arr , element );
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

    public static void searchElement(int[][]arr,int element){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == element) {
                    System.out.println ( "Element Found At Row: " + i + " Column: " + j );
                }
            }
        }
        System.out.println ( "Element Not Found" );
    }
}