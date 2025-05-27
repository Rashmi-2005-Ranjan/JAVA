public class ForEachLoop {
    public static void main(String[] args) {
        String[] array = {"Ram" , "Shyam" , "Mohan" , "Sohan" , "Sita" , "Gita" , "Hari"};
        printArray ( array );
    }

    public static void printArray(String[] array) {
        for (String name : array) {
            System.out.print ( name + " , " );
        }
    }
}
