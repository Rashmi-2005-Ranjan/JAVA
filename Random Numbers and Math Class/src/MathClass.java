public class MathClass {
    public static void main(String[] args) {
        System.out.println ("Absolute: "+ Math.abs(-99));
        System.out.println ("Ceiling: "+ Math.ceil(5.03));
        System.out.println ("Floor: "+ Math.floor(5.99));
        System.out.println ("Round: "+ Math.round(5.49));
        System.out.println ("Max: "+ Math.max(5, 10));
        System.out.println ("Min: "+ Math.min(5, 10));
        System.out.println ("Square Root: "+ Math.sqrt(25));
        System.out.println ("Random Number: "+ Math.random());
        System.out.println ("Random Number between 0 and 100: " + (int)(Math.random() * 100));
        System.out.println ("Random Number between 1 and 100: " + (int)(Math.random() * 100 + 1));
        System.out.println ("Random Number between 50 and 100: " + (int)(Math.random() * 51 + 50));
        System.out.println ("Random Number between 1 and 10: " + (int)(Math.random() * 10 + 1));
        System.out.println ("Random Number between 1 and 1000: " + (int)(Math.random() * 1000 + 1));
        System.out.println ("Random Number between 1 and 10000: " + (int)(Math.random() * 10000 + 1));
        System.out.println ("PI Value: "+ Math.PI);
    }
}
