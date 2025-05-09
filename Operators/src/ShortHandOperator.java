import java.util.Scanner;

public class ShortHandOperator {
    public static void main(String[] args) {
        int a=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int b = sc.nextInt();
        a += b; // a = a + b
        System.out.println("The value of a is: " + a);
    }
}
