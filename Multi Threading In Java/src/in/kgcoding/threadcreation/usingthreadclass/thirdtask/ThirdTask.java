package in.kgcoding.threadcreation.usingthreadclass.thirdtask;

public class ThirdTask extends Thread {
    @Override
    public void run() {
        System.out.println("Third Task Started");
        for (int i = 1; i <= 1000; i++) {
            System.out.printf ( "%d #" , i );
        }
        System.out.println("Third Task Complete");
        System.out.printf ( "Current Thread That Is Running %s " , Thread.currentThread ( ).getName ( ) );
    }
}
