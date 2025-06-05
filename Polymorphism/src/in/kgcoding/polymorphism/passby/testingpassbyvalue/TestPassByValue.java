package in.kgcoding.polymorphism.passby.testing;

public class TestPassByValue {
    public static void main(String[] args) {
        int x=5;
        int y=10;
        int sum=add ( x,y );
        System.out.printf ( "X= %d Y= %d Sum= %d%n", x, y, sum );
    }

    public static int add(int a,int b){
        a+=b;
        return a;
//        return a+b;
    }
}
