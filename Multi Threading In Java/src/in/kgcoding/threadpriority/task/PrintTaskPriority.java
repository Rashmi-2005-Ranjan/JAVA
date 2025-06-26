package in.kgcoding.threadpriority.task;

public class PrintTaskPriority implements Runnable {
    public PrintTaskPriority(char targetChar) {
        this.targetChar = targetChar;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d%c ", i, targetChar);
        }
        System.out.printf("\n %s %c task complete",
                Thread.currentThread().getName(),
                targetChar);    }

    private final char targetChar;
}
