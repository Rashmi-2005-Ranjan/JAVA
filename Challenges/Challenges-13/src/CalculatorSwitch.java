import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Calculator");
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = input.next().charAt(0);
        System.out.println("Using older switch statement:");
        calculateOlderSwitch(num1, num2, operation);
        System.out.println("Using new switch statement:");
        calculateNewSwitch(num1, num2, operation);
    }

    public static void calculateOlderSwitch(double num1, double num2, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
        }
    }

    public static void calculateNewSwitch(double num1, double num2, char operation) {
        double result = switch (operation) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if (num2 != 0) {
                    yield num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    yield Double.NaN; // Return NaN for division by zero
                }
            }
            default -> {
                System.out.println("Error: Invalid operation.");
                yield Double.NaN; // Return NaN for invalid operation
            }
        };
        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }
    }
}
