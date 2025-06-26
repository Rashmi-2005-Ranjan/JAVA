package challenge4.trafficlight;

import challenge4.trafficlightenum.TrafficLightColor;

public class TrafficLightThread extends Thread{
    private final TrafficLightColor color;
    public TrafficLightThread(TrafficLightColor color){
        this.color=color;
    }

    @Override
    public void run() {
        System.out.printf("%s Active\n",color);
        try {
            Thread.sleep ( color.getOnTimeInMillis () );
        } catch (InterruptedException e) {
            throw new RuntimeException ( e );
        }
        System.out.printf ( "%s Inactive\n",color );
    }
}
