import java.util.Scanner;

public class CalculateCircumferenceAndRadius {
    public static final double PI = Math.PI;
    public static double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }
    public static double calculateArea(double radius) {
        return PI * radius * radius;
    }
    public static double takeRadiusInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        return radius;
    }
    public static void main(String[] args) {
        double radius = takeRadiusInput();
        double circumference = calculateCircumference(radius);
        double area = calculateArea(radius);

        System.out.printf("Circumference of the circle: %.2f%n", circumference);
        System.out.printf("Area of the circle: %.2f%n", area);
    }
}

