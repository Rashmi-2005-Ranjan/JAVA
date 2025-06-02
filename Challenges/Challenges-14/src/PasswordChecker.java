import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Welcome To Set Your Password\n" );
        String password;
        do{
            System.out.println ("Please enter your password: ");
            password = scanner.nextLine();
        }while (!isValidPassword(password));
        System.out.println("Thanks For Entering Valid Password");
    }

    private static boolean isValidPassword(String password) {
        return password.length ()>6;
    }
}
