public class PrintingEven {
    public static void main(String[] args) {
        for(int i=1;i<100;i++){
            if(i%2==1){
                continue; // Skip odd numbers
            } else {
                System.out.println(i); // Print even numbers
            }
        }
    }
}
