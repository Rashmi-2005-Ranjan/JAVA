public class StringArray {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        // Print the array
        System.out.println("Names: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();

        // Find the length of the array
        System.out.println("Length of the array: " + names.length);

        // Access an element in the array
        System.out.println("First name: " + names[0]);

        String[] newNames = new String[5];
        newNames[0] = "Frank";
        System.out.println ("Length Of Array: " + newNames.length);
    }
}
