package in.kgcoding.wrapperclass;

public class WrapperClasses {
    public static void main(String[] args) {
        // Primitive Data Types
        int primitiveInt = 10;
        double primitiveDouble = 20.5;
        char primitiveChar = 'A';
        boolean primitiveBoolean = true;

        // Wrapper Classes
        Integer wrapperInt = Integer.valueOf(primitiveInt);
        Double wrapperDouble = Double.valueOf(primitiveDouble);
        Character wrapperChar = Character.valueOf(primitiveChar);
        Boolean wrapperBoolean = Boolean.valueOf(primitiveBoolean);

        // Displaying values
        System.out.println("Primitive Int: " + primitiveInt);
        System.out.println("Wrapper Int: " + wrapperInt);

        System.out.println("Primitive Double: " + primitiveDouble);
        System.out.println("Wrapper Double: " + wrapperDouble);

        System.out.println("Primitive Char: " + primitiveChar);
        System.out.println("Wrapper Char: " + wrapperChar);

        System.out.println("Primitive Boolean: " + primitiveBoolean);
        System.out.println("Wrapper Boolean: " + wrapperBoolean);
    }
}
