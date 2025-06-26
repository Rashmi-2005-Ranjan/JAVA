package in.kgcoding.threadcreation.usingthreadclass.firsttask;

public class FirstTask extends Thread {
    @Override
    public void run() {
        System.out.println ( "First Task Started" );
        for (int i = 1; i <= 1000; i++) {
            System.out.printf ( "%d* " , i );
        }
        System.out.println ( "First Task Complete" );
        System.out.printf ( "Current Thread That Is Running %s " , Thread.currentThread ( ).getName ( ) );
    }
}
