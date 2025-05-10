import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        int i = 1;
        System.out.println ( "Give 10 Number Input" );
        while (i <= 10) {
            System.out.println ( "Enter Number : " );
            int number = sc.nextInt ( );
            System.out.println ( "Number : " + number );
            i++;
        }
        System.out.println ( "End of Input" );
    }
}
