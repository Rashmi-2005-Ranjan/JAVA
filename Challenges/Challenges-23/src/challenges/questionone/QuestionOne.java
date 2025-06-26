package challenges.questionone;

import challenges.questionone.enums.Day;

public class QuestionOne {
    public static void main(String[] args) {
        Day[] days = {Day.MONDAY , Day.TUESDAY , Day.WEDNESDAY , Day.THURSDAY , Day.FRIDAY , Day.SATURDAY , Day.SUNDAY};
        for (Day day : days) {
            System.out.println ( day );
        }
        System.out.println ("=============================================" );
        //Printing The Action with Days
        for (Day day:days) {
            System.out.println (day+ " : " + day.getAction () );
        }
    }
}
