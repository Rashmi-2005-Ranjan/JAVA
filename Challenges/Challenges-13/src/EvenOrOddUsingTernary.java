import java.util.Scanner;

public class EvenOrOddUsingTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Even or Odd Checker");
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        boolean isEven= number%2==0 ? true : false; // Using ternary operator to check if the number is even
        String result = isEven ? "even" : "odd"; // Using ternary operator to determine the result
        System.out.println("The number " + number + " is " + result + ".");
    }
}
