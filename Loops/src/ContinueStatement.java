public class ContinueStatement {
    public static void main(String[] args) {
        System.out.println("Entering Into Loop");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue; // Skips the rest of the loop iteration for even numbers
            }
            System.out.println("i = " + i);
        }
        System.out.println("Exiting Loop");
    }
}
