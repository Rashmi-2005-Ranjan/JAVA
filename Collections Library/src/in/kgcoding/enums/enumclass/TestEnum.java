package in.kgcoding.enums.enumclass;

import in.kgcoding.enums.Grade;
import in.kgcoding.enums.TrafficLight;

public class TestEnum {
    public static void main(String[] args) {
        TrafficLight color = TrafficLight.RED;
        color = TrafficLight.GREEN;
        System.out.println ( "Current Traffic Light Color: " + color );

        Grade grade = Grade.A;
        switch (grade) {
            case A:
                System.out.println ( "Excellent" );
                break;
            case B:
                System.out.println ( "Good" );
                break;
            case C:
                System.out.println ( "Average" );
                break;
            case D:
                System.out.println ( "Below Average" );
                break;
            case E:
                System.out.println ( "Poor" );
                break;
            case F:
                System.out.println ( "Fail" );
                break;
            default:
                System.out.println ( "Invalid Grade" );
        }
    }
}
