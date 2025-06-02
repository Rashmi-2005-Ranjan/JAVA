import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner ( System.in );
        System.out.println ( "Enter the first number" );
        int num1=sc.nextInt ();
        System.out.println ( "Enter the second number" );
        int num2=sc.nextInt ();
        System.out.println ("The Sum Of "+num1 +" and "+num2+" is: "+(num1+num2));
        System.out.println ("The Difference Of "+num1 +" and "+num2+" is: "+(num1-num2));
        System.out.println ("The Product Of "+num1 +" and "+num2+" is: "+(num1*num2));
        System.out.println ("The Division Of "+num1 +" and "+num2+" is: "+(num1/num2));
        System.out.println ("The Modulus Of "+num1 +" and "+num2+" is: "+(num1%num2));
    }
}