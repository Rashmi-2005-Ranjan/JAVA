public class ObjectCreationWithfinalField {
    public final String name;
    public final int age;
    public final String address;
    public final String phoneNumber;
    public final String email;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder ( "Details {" );
        sb.append ( "name='" ).append ( name ).append ( '\'' );
        sb.append ( ", age=" ).append ( age );
        sb.append ( ", address='" ).append ( address ).append ( '\'' );
        sb.append ( ", phoneNumber='" ).append ( phoneNumber ).append ( '\'' );
        sb.append ( ", email='" ).append ( email ).append ( '\'' );
        sb.append ( '}' );
        return sb.toString ( );
    }

    public ObjectCreationWithfinalField(String name , int age , String address , String phoneNumber , String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public static void main(String[] args) {
        ObjectCreationWithfinalField ob=new ObjectCreationWithfinalField (
                "John Doe" ,
                30 ,
                "123 Main St, City, Country" ,
                "123-456-7890" ,
                "john@example.com"
        );
        System.out.println("Name: " + ob);
    }
}
