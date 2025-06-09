package in.kgcoding.variableargs;

public class VarArgs {
    public static void main(String... args) {
        //Bruteforce Kind
        System.out.println ( sum ( 4 , 5 ) );
        //Better
        System.out.println ( sum ( new int[]{4 , 5} ) );
        //Optimal
        System.out.println ( sumUsingVarArgs ( 4 , 5 , 5 , 7 , 8 , 9 ) );
    }


    //Bruteforce Kind
    public static int sum(int a , int b) {
        return a + b;
    }

    //Better Kind
    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    //Optimal Kind Using VarArgs
    public static int sumUsingVarArgs(int first , int second , int... a) {
        int sum = first+second;
        for (int i=0;i<a.length;i++) {
            sum += a[i];
        }
        return sum;
    }
}
