package threadstate;

public class ThreadState extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep ( 5000 );
            System.out.printf ( "From Inside Run %s\n",getState ());
        } catch (InterruptedException e) {
            throw new RuntimeException ( e );
        }
    }
}
