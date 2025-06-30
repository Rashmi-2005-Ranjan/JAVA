package printTask;

public class Print implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print ( "\nValue Of I: " + i );
        }
        System.out.printf ( "\n%s Task Complete\n" , Thread.currentThread ( ).getName ( ) );
    }
}
