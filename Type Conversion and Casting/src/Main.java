public class Main {
    public static void main(String[] args) {
        // Implicit casting (widening conversion)
        int intValue = 100;
        double doubleValue = intValue; // int to double
        System.out.println("Implicit casting (int to double): " + doubleValue);

        // Explicit casting (narrowing conversion)
        double anotherDoubleValue = 100.99;
        int anotherIntValue = (int) anotherDoubleValue; // double to int
        System.out.println("Explicit casting (double to int): " + anotherIntValue);

        // String to Integer conversion
        String strNumber = "123";
        int parsedInt = Integer.parseInt(strNumber);
        System.out.println("String to Integer: " + parsedInt);

        // Integer to String conversion
        String convertedStr = String.valueOf(parsedInt);
        System.out.println("Integer to String: " + convertedStr);
    }
}