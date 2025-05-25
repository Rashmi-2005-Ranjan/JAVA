import java.util.Scanner;

public class ScoreCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Score Calculator");
        System.out.print("Enter the score: ");
        int score = input.nextInt();
        // Using ternary operator to determine the grade based on the score
        String grade=score>80?"High":score>=50&&score<=80?"Moderate":"low";
        System.out.println("The grade for the score " + score + " is: " + grade);
    }
}
