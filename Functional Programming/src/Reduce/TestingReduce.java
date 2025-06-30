package Reduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of ( 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 );
        int newSum = numbers.stream ( )
                .reduce ( 0 , new BinaryOperator<Integer> ( ) {
                    @Override
                    public Integer apply(Integer integer , Integer integer2) {
                        return integer + integer2;
                    }
                } );
        System.out.printf ( "\n Sum Using Reduce(By Using Functional Interface) Is : %d" , newSum );

        int anotherSum = numbers.stream ( )
                .reduce ( 0 , (a , b) -> a + b );
        System.out.printf ( "\n Sum Using Reduce(By Using Lambda) Is : %d\n" , anotherSum );

        int max = numbers
                .stream ( )
                .reduce ( Integer.MIN_VALUE , (a , b) -> a > b ? a : b );
        System.out.println ("Max Value Is: "+max);
    }
}
