import java.util.Scanner;

public class GuessingGame {
    public static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1; // Generates a random number between 1 and 100
    }

    public static void main(String[] args) {
        int randomNumber= generateRandomNumber();
//        System.out.println ("Random number generated (for testing purposes): " + randomNumber);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");
        System.out.println ("Enter your guess:");
        int userguess=scanner.nextInt();
        while (userguess != randomNumber){
            if (userguess < randomNumber) {
                System.out.println("Too low! Try again:");
            } else {
                System.out.println("Too high! Try again:");
            }
            userguess = scanner.nextInt();
        }
        System.out.println("Congratulations! You've guessed the number: " + randomNumber);
    }
}
