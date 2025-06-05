package abstraction.challenge.questionone.test;

import abstraction.challenge.questionone.subclass.Circle;
import abstraction.challenge.questionone.subclass.Square;

public class Test {
    public static void main(String[] args) {
        Circle circle=new Circle ();
        circle.calculateArea ( 3 );
        Square square=new Square ();
        square.calculateArea ( 4 );
    }
}
