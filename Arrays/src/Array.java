public class Array {
    public static void main(String[] args) {
        // Declaring an Array
        int[] numbers=new int[5];
        // Initializing an Array
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;
        numbers[4]=5;
        int[] numbers2={1,2,3,4,5};
        // Accessing an Array
        System.out.println("First element: "+numbers2[0]);
        System.out.println("Second element: "+numbers2[1]);
        System.out.println("Third element: "+numbers2[2]);
        System.out.println("Fourth element: "+numbers2[3]);
        System.out.println("Fifth element: "+numbers2[4]);
        // Printing an Array
        System.out.println("Array length: "+numbers.length);
        System.out.println("Array elements:");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}