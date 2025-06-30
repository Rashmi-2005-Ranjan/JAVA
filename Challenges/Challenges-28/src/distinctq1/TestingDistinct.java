package distinctq1;

import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct {
    public static void main(String[] args) {
        List<Integer> numbers = List.of ( 1 , 5 , 9 , 2 , 3 , 8 , 2 , 7 , 4 , 5 , 3 , 5 , 1 );
        List<Integer> distinctNumbers = numbers.stream ( )
                .distinct ( )
                .collect ( Collectors.toList ( ) );
        System.out.println ( numbers );
        System.out.println ( distinctNumbers );
    }
}
