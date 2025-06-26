package threadclass;

public class HelloThread extends Thread {

    private final int threadNo;

    public HelloThread(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf ("(%d) Hello From Thread %d\n",i+1,threadNo);
        }
    }
}
