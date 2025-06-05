import java.util.Scanner;

public class ConcatenateAndConvert {
    public static String takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        return input;
    }

    public static String concatenate(String str1, String str2) {
        String concatenated = str1 + str2;
        return concatenated;
    }

    public static String convertToUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        String firstString = takeInput();
        String secondString = takeInput();

        String concatenatedString = concatenate(firstString, secondString);
        String upperCaseString = convertToUpperCase(concatenatedString);
        System.out.println("Concatenated and Uppercase String: " + upperCaseString);
    }
}
