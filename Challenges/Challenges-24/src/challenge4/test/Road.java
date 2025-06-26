package challenge4.test;

import challenge4.trafficlight.TrafficLightThread;
import challenge4.trafficlightenum.TrafficLightColor;

public class Road {
    public static void main(String[] args) throws InterruptedException {
        TrafficLightThread red = new TrafficLightThread ( TrafficLightColor.RED );
        TrafficLightThread yellow = new TrafficLightThread ( TrafficLightColor.YELLOW );
        TrafficLightThread green = new TrafficLightThread ( TrafficLightColor.GREEN );
        System.out.println ("Stop Signal Is Red!!!!!!!!!!!!!!");
        red.start ( );
        red.join ();
        yellow.start ( );
        yellow.join ();
        green.start ( );
        green.join ();
        System.out.println ("You Can Go Now Road is cleared..........");
    }
}
