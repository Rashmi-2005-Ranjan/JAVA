public class BreakStatement {
    public static void main(String[] args) {
        System.out.println ("Entering Into Loop" );
        for(int i=1;i<100;i++){
            System.out.println ("i = " + i);
            if(i==101){
                break; // Breaks the loop when i equals 101
            }
        }
        System.out.println ("Exiting Loop" );
    }
}
