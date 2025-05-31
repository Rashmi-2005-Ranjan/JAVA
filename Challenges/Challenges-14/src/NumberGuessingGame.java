import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int num= (int) (Math.random() * 10) + 1; // Random number between 1 and 10
        int num = 7; // Fixed number for testing purposes
        System.out.println ("The number to guess is: " + num); // For testing purposes
        System.out.println ("Welcome to the Number Guessing Game!");
        int guess;
        do{
            System.out.println ("Please enter a number between 1 and 10:");
             guess = scanner.nextInt();
        }while (guess != num);
        System.out.println ("Congratulations! You guessed the number correctly.");
    }
}
