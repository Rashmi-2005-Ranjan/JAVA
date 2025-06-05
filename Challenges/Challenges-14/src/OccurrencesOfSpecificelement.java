import java.util.Scanner;

public class OccurrencesOfSpecificelement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Occurrences Finder!");
        System.out.println("Please enter the size of the array:");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Please enter the element to find its occurrences:");
        int element = scanner.nextInt();
        int occurrences = countOccurrences(numbers, element);
        System.out.println("The element " + element + " occurs " + occurrences + " times in the array.");
    }

    private static int countOccurrences(int[] numbers , int element) {
        int count=0;
        for(int num:numbers){
            if(num == element) {
                count++;
            }
        }
        return count;
    }
}
