package in.kgcoding.threadcreation.usingrunnableinterface.task;

public class PrintTask implements Runnable {
    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }

    @Override
    public void run() {
        System.out.println ( "Print Task Started" );
        for (int i = 1; i <= 1000; i++) {
            System.out.printf ( "%d %c" , i , targetChar );
        }
        System.out.printf ( "%s %c task complete" , Thread.currentThread ( ).getName ( ) , targetChar );
    }

    private final char targetChar;
}
