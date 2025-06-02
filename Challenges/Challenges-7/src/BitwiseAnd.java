import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println ("Enter First Number" );
        int a= sc.nextInt();
        System.out.println ("Enter Second Number" );
        int b= sc.nextInt();
        System.out.println ("Bitwise AND of " + a + " and " + b + " is: " + (a & b));
    }
}