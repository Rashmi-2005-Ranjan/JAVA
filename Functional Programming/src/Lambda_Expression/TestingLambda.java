package Lambda_Expression;

public class TestingLambda {
    public static void main(String[] args) {
        TestingLambda testingLambda = new TestingLambda ( );
        int sum = testingLambda.sum ( 4 , 5 );
        testingLambda.printString ( "Java Is The King" );

        // toPrint-> System.out.println (toPrint );
        //(a,b)->a+b;
        //(a,b)->{
        // int sum=a+b;
        // System.out.println(sum);
        // }
    }

    public int sum(int a , int b) {
        return a + b;
    }

    public void printString(String str) {
        System.out.println ( str );
    }
}
