public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 5; // 0101
        int b = 3; // 0011

        // Bitwise AND
        int andResult = a & b; // 0001
        System.out.println("Bitwise AND: " + andResult);

        // Bitwise OR
        int orResult = a | b; // 0111
        System.out.println("Bitwise OR: " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b; // 0110
        System.out.println("Bitwise XOR: " + xorResult);

        // Bitwise NOT
        int notResult = ~a; // 1010 (inverted bits)
        System.out.println("Bitwise NOT: " + notResult);
        // Left Shift
        int leftShiftResult = a << 1; // 1010
        System.out.println("Left Shift: " + leftShiftResult);
        // Right Shift
        int rightShiftResult = a >> 1; // 0010
        System.out.println("Right Shift: " + rightShiftResult);
        // Bitwise Complement
        int complementResult = ~a; // 1010 (inverted bits)
        System.out.println("Bitwise Complement: " + complementResult);
    }
}
