package in.kgcoding.polymorphism.overloading;

public class MethodOverloading {

    public int add(int a , int b) {
        return a + b;
    }

    public MethodOverloading(){
        System.out.println ("Default Constructor Called...." );
    }

    public MethodOverloading(String pop){
        System.out.println (pop );
    }

    public int add(int a , int b , int c , int d) {
        return a + b + c + d;
    }

    public String add(String a , String b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading overload = new MethodOverloading ( );
        System.out.println ( overload.add ( 10 , 20 ) );

        // Sum 3 Numbers
        int sum = overload.add ( 1 , 2 );
        sum = overload.add ( sum , 3 );
        System.out.println ( sum );
        // Sum 4 Numbers
        sum = overload.add ( 1 , 2 , 3 , 4 );
        System.out.println ( sum );
        // Concatenate Strings
        String result = overload.add ( "Hello, " , "World!" );
        System.out.println ( result );

        // Using Constructor Overloading
        MethodOverloading overload1 = new MethodOverloading ( "Constructor Overloading Called" );
    }
}
