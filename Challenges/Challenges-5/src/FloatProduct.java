import java.util.Scanner;

public class FloatProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner ( System.in );
        System.out.println ( "Enter the first number" );
        float num1=sc.nextFloat ();
        System.out.println ( "Enter the second number" );
        float num2=sc.nextFloat ();
        System.out.println ("The Product Of "+num1 +" and "+num2+" is: "+(num1*num2));
    }
}
