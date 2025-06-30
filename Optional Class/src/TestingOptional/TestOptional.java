package TestingOptional;

import java.util.List;
import java.util.Optional;

public class TestOptional {
    public static void main(String[] args) {
        List<Integer> numbers=List.of ( 1,3,4,5,6,7,8,9 );
//        List<Integer> numbers=List.of (  );
        Optional<Integer> sum=numbers.stream ()
                .reduce ( (a,b)->a+b );
        if(sum.isPresent ()){
            System.out.println (sum.get () );
        }else {
            System.out.println ("List Is Empty" );
        }
    }
}
