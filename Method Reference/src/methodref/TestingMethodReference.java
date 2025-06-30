package methodref;


import java.util.List;

public class TestingMethodReference {
    public static void main(String[] args) {
        List<Integer> numbers = List.of ( 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 );
        numbers.stream ( )
                .filter ( num -> num % 2 != 0 )
                .forEach ( num -> System.out.println ( num ) );

        numbers.stream ( )
                .filter ( num -> num % 2 != 0 )
                .forEach ( System.out::println );


        int sum = numbers
                .stream ( )
                .reduce ( 0 , Integer::sum );
        System.out.println ( "Sum of all numbers: " + sum );
    }
}

