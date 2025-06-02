import java.util.Scanner;

public class DetermineNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner ( System.in );
        System.out.println ( "Enter a number: " );
        int number = sc.nextInt ();
        if(number>0){
            System.out.println ("It is a Positive Number" );
        }else if(number<0){
            System.out.println ("It is a Negative Number" );
        }else{
            System.out.println ("It is a Zero" );
        }
    }
}