import java.util.Scanner;

public class ArrayOfWordsConcatenation {
    public static char[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter The Size Of The Character Array: " );
        int size = scanner.nextInt();
        char[] charArray = new char[size];
        System.out.println ("Enter " + size + " characters:");
        for (int i = 0; i < size; i++) {
            charArray[i] = scanner.next().charAt(0);
        }
        return charArray;
    }

    public static void main(String[] args) {
        // Take input from the user
        char[] inputArray = takeInput();
        StringBuilder concatenatedString = new StringBuilder();
        for (char c:inputArray ){
            concatenatedString.append(c);
        }
        // Print the concatenated string
        System.out.println("Concatenated String: " + concatenatedString);
    }
}
