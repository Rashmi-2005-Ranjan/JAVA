import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println ("Please Enter Your Age: " );
//        int age = input.nextInt();
//        while(age<0 || age>100){
//            System.out.println("Invalid age. Please enter a valid age between 0 and 100: ");
//            age = input.nextInt();
//        }
//        System.out.println("Your age is: " + age);
        int age;
        do{
            System.out.println ("Please Enter Your Age: " );
             age = input.nextInt();
        }while (age < 0 || age > 100);
        System.out.println("Your age is: " + age);
    }
}
