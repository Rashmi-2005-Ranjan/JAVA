package question1;

import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of ( 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 );
        int ans = numbers
                .stream ( )
                .reduce ( 1 , (a , b) -> a * b );
        System.out.println ( ans );
    }
}
