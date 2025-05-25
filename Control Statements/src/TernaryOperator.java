import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input=new Scanner ( System.in );
        System.out.println ("Welcome To Number Checker" );
        System.out.print ("Enter a number: " );
        int num1 = input.nextInt();
        System.out.print ("Enter another number: " );
        int num2 = input.nextInt();
//        if(num1>num2){
//            System.out.println (num1 + " is greater than " + num2);
//        } else{
//            System.out.println (num2 + " is greater than " + num1);
//        }
        int greaterNumber=num1>num2? num1 : num2;
        System.out.println (greaterNumber + " is greater than the other number." );
    }
}