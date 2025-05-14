import java.util.Scanner;

public class IFELSE {
    public static void main(String[] args) {
        Scanner sc=new Scanner ( System.in );
        System.out.println ( "Enter Your Name" );
        String name=sc.nextLine ();
        System.out.println ( "Enter Your Gender" );
        String gender=sc.nextLine ();
        if(gender.equalsIgnoreCase ( "MALE" )){
            System.out.println ("Hello Mr. "+name );
        }else{
            System.out.println ("Hello Ms. "+name );
        }
    }
}