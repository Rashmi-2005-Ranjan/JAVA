import java.util.Scanner;

public class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner ( System.in );
        System.out.println ( "Enter A Number: " );
        int n=sc.nextInt ();
        if((n & 1) == 1){
            System.out.println ( "The number is Odd" );
        }
        else{
            System.out.println ( "The number is Even" );
        }
    }
}

// The above code is a simple Java program that checks if a number is odd or even using bitwise operators.
// It uses the bitwise AND operator (&) to check the least significant bit of the number.
// If the least significant bit is 1, the number is odd; otherwise, it is even.
// In Case Of Binary Representation: Odd Number has 1 in the last bit and Even Number has 0 in the last bit.
// So If we do AND operation with 1, we will get 1 if the number is odd and 0 if the number is even.
