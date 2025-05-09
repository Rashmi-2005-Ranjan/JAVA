import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        double principal = sc.nextDouble();
        System.out.println("Enter the rate of interest");
        double rate = sc.nextDouble();
        System.out.println("Enter the time in years");
        double time = sc.nextDouble();

        double compoundInterest=principal*Math.pow ( (1+rate/100),time );
        System.out.println("The Compound Interest is: "+compoundInterest);

    }
}
