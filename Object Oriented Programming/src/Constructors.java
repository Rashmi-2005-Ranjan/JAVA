public class Constructors {
    // Default constructor
    public Constructors() {
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    public Constructors(String message) {
        System.out.println("Parameterized constructor called with message: " + message);
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        Constructors obj1 = new Constructors();

        // Creating an object using the parameterized constructor
        Constructors obj2 = new Constructors("Hello, World!");
    }
}
