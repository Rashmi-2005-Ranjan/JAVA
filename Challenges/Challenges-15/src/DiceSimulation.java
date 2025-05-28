import java.util.Scanner;

public class DiceSimulation {
    public static void rollDice(){
        int diceRoll = (int) (Math.random()*6)+1; // Generates a random number between 1 and 6
        System.out.println("You rolled " + diceRoll);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of times to roll the dice:");
        int rolls = scanner.nextInt();
        for(int i = 0; i < rolls; i++) {
            rollDice ();
        }
    }
}
