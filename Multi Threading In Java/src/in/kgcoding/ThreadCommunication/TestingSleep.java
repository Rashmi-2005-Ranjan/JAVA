package in.kgcoding.ThreadCommunication;

public class TestingSleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println ( "Before Sleeping" );
        Thread.sleep ( 10000 );
        System.out.println ( "Woke Up" );
    }
}
