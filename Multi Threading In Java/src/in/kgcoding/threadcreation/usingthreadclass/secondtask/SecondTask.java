package in.kgcoding.threadcreation.usingthreadclass.secondtask;

public class SecondTask extends Thread {
    @Override
    public void run() {
        System.out.println("Second Task Started");
        for (int i = 1; i <= 1000; i++) {
            System.out.printf ( "%d $" , i );
        }
        System.out.println("Second Task Complete");
        System.out.printf ( "Current Thread That Is Running %s " , Thread.currentThread ( ).getName ( ) );
    }
}