import java.util.Scanner;

public class AddAllOddNumbers {
    public static void main(String[] args) {
        int num=readInput ();
        addOddNumbers1ToN ( num );
    }

    public static void addOddNumbers1ToN(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println ("The Sum Of Odd Numbers From 1 to "+n+" is "+sum );
    }

    public static int readInput(){
        greet ();
        Scanner sc=new Scanner ( System.in );
        System.out.print ( "Enter a number to get the sum of odd numbers from 1 to that number: " );
        int num=sc.nextInt ();
        return num;
    }

    public static void greet(){
        System.out.println ( "Welcome To Odd Number Calculator Starting From 1 to n" );
    }
}
