import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println (a + " is greatest");
        }else if(b>a && b>c) {
            System.out.println ( b + " is greatest" );
        }
        else if(c>a && c>b) {
            System.out.println ( c + " is greatest" );
        }else if(a==b && b==c && a==c) {
            System.out.println ( "All are equal" );
        }else {
            System.out.println ("You Entered 0" );
        }
    }
}
