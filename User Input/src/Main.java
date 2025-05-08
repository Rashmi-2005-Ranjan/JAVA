import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input=new Scanner ( System.in );
        // Prompt the user for their name
        System.out.print("Enter your name: ");
        // Read the user's name
        String name = input.nextLine();
        // Prompt the user for their age
        System.out.print("Enter your age: ");
        // Read the user's age
        int age = input.nextInt();
        // Prompt the user for their height
        System.out.print("Enter your height in cm: ");
        // Read the user's height
        double height = input.nextDouble();
        // Prompt The User To Take a Character Input
        System.out.print("Enter a character: ");
        // Read the user's character input
        char character = input.next().charAt(0);
        // Print the character entered by the user
        System.out.println("Character entered: " + character);
        // Print the user's information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " cm");
        // Close the scanner to prevent resource leaks
        input.close();
    }
}