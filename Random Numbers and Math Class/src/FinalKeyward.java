public class FinalKeyward {
//    double pi=3.1412;
    final double PI=2.7182;
    void testing(){
//        PI=56; ========>   final variables cannot be reassigned
        System.out.println("Value of PI is: " + PI);
    }
    public static void main(String[] args) {
        FinalKeyward fk = new FinalKeyward();
        fk.testing();
    }
}
