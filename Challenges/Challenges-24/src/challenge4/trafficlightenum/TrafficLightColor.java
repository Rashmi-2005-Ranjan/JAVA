package challenge4.trafficlightenum;

public enum TrafficLightColor {
    RED(10000),
    YELLOW(1000),
    GREEN(3000);

    private final int onTimeInMillis;

    public int getOnTimeInMillis() {
        return onTimeInMillis;
    }

    TrafficLightColor(int onTimeInMillis){
        this.onTimeInMillis=onTimeInMillis;
    }
}
