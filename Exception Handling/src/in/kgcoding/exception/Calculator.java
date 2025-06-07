package in.kgcoding.exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in );
        System.out.println ( "Welcome To Division Calculator" );
        System.out.println ( "Please Enter Two Numbers" );
        int first = input.nextInt ( );
        int second = input.nextInt ( );
        // Handling division by zero
        try {
            int[] arr= new int[5];
            arr[6]=first/second;
            System.out.println ( "The Result is: " + arr[6] );
            int result = first / second;
            System.out.println ( "The Result is: " + result );
        } catch (ArithmeticException exception) {
            System.out.println (exception.getMessage () );
            System.out.println ( "Error: Division by zero is not allowed. Please enter a non-zero second number." );
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println (exception.getMessage () );
            System.out.println ("Error: Array Index Out Of Bound");
        }catch (Exception e){
            System.out.println (e.getMessage () );
            System.out.println ("Catch By Exception Class");
        }catch (Throwable t){
            System.out.println (t.getMessage () );
            System.out.println ("Catch By Throwable Class");
        }
    }
}
