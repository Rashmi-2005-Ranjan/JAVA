package in.kgcoding.equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person1=new Person ( "Rashmi",20, "12345" );
        Person person2=new Person ( "Rashmi",/*30*/20, "12345" );
        // Check if both objects are same using equals method
        if(person1 .equals ( person2 )) {
            System.out.println ( "Both are same" );
        } else {
            System.out.println ( "Both are different" );
        }
    }
}
