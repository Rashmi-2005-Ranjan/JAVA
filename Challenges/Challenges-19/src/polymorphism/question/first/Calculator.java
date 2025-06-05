package polymorphism.question.first;

public class Calculator {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        Calculator calculator=new Calculator ();
        int s1=calculator.add ( 1,2 );
        System.out.println (s1);
        int s2=calculator.add ( 4,5,6 );
        System.out.println (s2);
        double s3=calculator.add ( 5.3,6.8 );
        System.out.println (s3);
    }
}
