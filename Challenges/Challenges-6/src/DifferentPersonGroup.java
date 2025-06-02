import java.util.Scanner;

public class DifferentPersonGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter your age" );
        int age = sc.nextInt ( );
        if (age <= 13) {
            System.out.println ( "You are a child" );
        } else if (age > 13 && age <= 19) {
            System.out.println ( "You are a Teenager" );
        } else if (age > 19 && age < 60) {
            System.out.println ( "You are an Adult" );
        } else {
            System.out.println ( "You are a Senior Citizen" );
        }
    }
}
