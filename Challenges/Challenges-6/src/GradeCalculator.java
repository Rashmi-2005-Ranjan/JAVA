import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter Your Percentage" );
        double marks = sc.nextDouble ( );
        if (marks >= 90) {
            System.out.println ( "A Grade" );
        } else if (marks >= 75 && marks < 90) {
            System.out.println ( "B Grade" );
        } else if (marks >= 60 && marks < 75) {
            System.out.println ( "C Grade" );
        } else if (marks >= 30 && marks < 60) {
            System.out.println ( "D Grade" );
        } else {
            System.out.println ( "You Have Below 30% Mark Your Grade is F" );
        }

    }
}
