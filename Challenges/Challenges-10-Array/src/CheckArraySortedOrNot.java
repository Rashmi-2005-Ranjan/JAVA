import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckArraySortedOrNot {
    public static void main(String[] args) {
        List<Integer> arr = takeInputArray();
        checkArraySorted(arr);
    }

    public static List<Integer> takeInputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array: ");
        int size = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter The Elements Of The Array: ");
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        return arr;
    }

    public static void checkArraySorted(List<Integer> arr) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) < arr.get(i + 1)) {
                descending = false;
            } else if (arr.get(i) > arr.get(i + 1)) {
                ascending = false;
            }
        }

        if (ascending) {
            System.out.println("The Array Is Sorted In Ascending Order");
        } else if (descending) {
            System.out.println("The Array Is Sorted In Descending Order");
        } else {
            System.out.println("The Array Is Not Sorted");
        }
    }
}
