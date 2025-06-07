import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Two numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int div;
        try{
            div= number1 / number2;
            System.out.println ("Result: " + div);
        }catch (ArithmeticException r){
            System.out.println ("Division by zero is not allowed.");
        }finally {
            input.close ();
            System.out.println ("Scanner Closed In Finally Block");
        }
    }
}
