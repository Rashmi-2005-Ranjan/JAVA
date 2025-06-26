package in.kgcoding.need;

public class NeedOfMultiThreading {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis ();
        System.out.println ( "First Task Started" );
        for (int i = 1; i <= 1000; i++) {
            System.out.printf ( "%d* " , i );
        }
        System.out.println ( "\n First Task Complete" );
        System.out.println ( "Second Task Started" );
        for (int i = 1; i <= 1000; i++) {
            System.out.printf ( "%d$ " , i );
        }
        System.out.println ( "\n Second Task Complete" );
        System.out.println ( "Third Task Started" );
        for (int i = 1; i <= 1000; i++) {
            System.out.printf ( "%d# " , i );
        }
        System.out.println ( "\n Third Task Complete" );
        long endTime=System.currentTimeMillis ();
        System.out.println ( "Total Time Taken: " + (endTime - startTime) + " ms" );
    }
}
