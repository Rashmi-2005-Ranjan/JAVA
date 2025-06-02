import java.util.Scanner;

public class SumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        int num=readInput ();
        int sum=sumOfDigits ( num );
        System.out.println ( "The sum of digits of " + num + " is: " + sum );
    }
    public static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    public static int readInput(){
        greet ();
        Scanner sc=new Scanner ( System.in );
        System.out.println ( "Enter a number : " );
        int num=sc.nextInt ();
        return num;
    }
    public static void greet(){
        System.out.println ( "Welcome To Sum Of Digit Calculator" );
    }

}
