public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("First");
        sb.append ( 45 );
        sb.append ( " Second" );
        sb.append ( 67.89 );
        sb.toString ();
        System.out.println(sb);
    }
}
