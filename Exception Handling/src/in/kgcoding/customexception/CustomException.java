package in.kgcoding.customexception;

public class CustomException {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("This is a custom exception message.");
        } catch (MyCustomException e) {
            System.out.println("Caught a custom exception: " + e.getMessage());
        }
    }

    static class MyCustomException extends Exception {
        public MyCustomException(String message) {
            super(message);
        }
    }
}
