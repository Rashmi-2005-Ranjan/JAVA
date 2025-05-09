import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner ( System.in );
        System.out.println ("welcome To Our Ticket Discount calculator" );
        System.out.println ("please Enter Your Age" );
        int age=sc.nextInt ();
        sc.nextLine ();
        System.out.println ( "Please Enter Your Gender" );
        String gender=sc.nextLine ();
        System.out.println ( "Please Enter Original Ticket Price" );
        double ticketPrice=sc.nextDouble ();
        if(age<5){
            System.out.println ("Your Ticket Discounted By 75 %" );
            System.out.println ("Your Ticket Price is "+ (ticketPrice*0.25) );
        }else if(age>60 && gender.equalsIgnoreCase ( "male" )){
            System.out.println ("Your Ticket Discounted By 25 %" );
            System.out.println ("Your Ticket Price is "+ (ticketPrice*0.85) );
        }else if(age>60 && gender.equalsIgnoreCase ( "female" )){
            System.out.println ("Your Ticket Discounted By 50 %" );
            System.out.println ("Your Ticket Price is "+ (ticketPrice*0.50) );
        }else{
            System.out.println ("Your Ticket Price is "+ ticketPrice );
            System.out.println ("You are an adult and not eligible for any discount" );
        }
    }
}
