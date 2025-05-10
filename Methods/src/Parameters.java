public class Parameters {
    public static void main(String[] args) {
        System.out.println ("Multiplication of 4 and 7 is: " + multiply ( 4,7 )); // Argument
        System.out.println ( );
        System.out.println ("Multiplication of 47 and 7 is: " + multiply ( 47,7 )); // Argument
        System.out.println ( );
        System.out.println ("Multiplication of 4 and 58 is: " + multiply ( 4,58 )); // Argument
    }

    public static int multiply(int a, int b) { //Parameter
        System.out.println ("First Number Received: "+a );
        System.out.println ("Second Number Received: "+b );
        return a * b;
    }
}
