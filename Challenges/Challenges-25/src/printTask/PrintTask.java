package printTask;

public class PrintTask implements Runnable {
    @Override
    public void run() {
        System.out.printf ( "Started With Thread : %s\n" , Thread.currentThread ( ).getName ( ) );
        try {
            int time=(int)(Math.random ()*5+1)*1000;
            System.out.printf ("\n%s Sleep For %d Second\n",Thread.currentThread ().getName (),time/1000);
            Thread.sleep ( time );
        } catch (InterruptedException e) {
            throw new RuntimeException ( e );
        }
        System.out.printf ( "Ended With Thread : %s\n" , Thread.currentThread ( ).getName ( ) );
    }
}
