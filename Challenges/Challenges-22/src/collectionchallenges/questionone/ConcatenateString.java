package collectionchallenges.questionone;

public class ConcatenateString {
    public static void main(String[] args) {
        System.out.println (concatenateStrings("Hello","World","!","How","are","you"));
    }

    public static String concatenateStrings(String ... s){
        StringBuilder builder=new StringBuilder ();
        for(String str:s){
            builder.append ( str ).append ( " " );
        }
        return builder.toString ();
    }
}
