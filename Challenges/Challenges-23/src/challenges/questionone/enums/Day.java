package challenges.questionone.enums;

public enum Day {
    MONDAY("Weekday"), TUESDAY("Weekday"), WEDNESDAY("Weekday"), THURSDAY("Weekday"), FRIDAY("Weekday"), SATURDAY("Weekend"), SUNDAY("Weekend");
    private final String action;

    public String getAction() {
        return action;
    }

    Day(String action) {
        this.action = action;
    }
}
