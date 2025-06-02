import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create a Program To Input Of The Person name and Respond With "Welcome Name to Kg Coding"
        Scanner sc=new Scanner ( System.in);

        System.out.print("Enter Your Name : " );
        String name=sc.nextLine ();
        System.out.println ("Welcome "+name+" to KG Coding" );
    }
}