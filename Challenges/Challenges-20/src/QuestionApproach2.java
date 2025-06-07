import java.util.Scanner;

public class QuestionApproach2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Two numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int div;
        try{
            div= number1 / number2;
            System.out.println ("Result: " + div);
        }catch (ArithmeticException exception){
            if(exception.getMessage ().equals ( "/ by zero" )){
                System.out.println ("Divide By Zero Occurred.");
            }else{
                throw exception;
            }
        }finally {
            input.close ();
            System.out.println ("Scanner Closed In Finally Block");
        }
    }
}
