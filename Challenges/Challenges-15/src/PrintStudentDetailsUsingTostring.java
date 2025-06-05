public class PrintStudentDetailsUsingTostring {
    public int rollNo;
    public String name;
    public String address;
    public String phoneNumber;
    public String email;
    public String course;
    public String dateOfBirth;

    public PrintStudentDetailsUsingTostring(int rollNo , String name , String address , String phoneNumber , String email , String course , String dateOfBirth) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.course = course;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder ( "Student Details{" );
        sb.append ( "rollNo=" ).append ( rollNo );
        sb.append ( ", name='" ).append ( name ).append ( '\'' );
        sb.append ( ", address='" ).append ( address ).append ( '\'' );
        sb.append ( ", phoneNumber='" ).append ( phoneNumber ).append ( '\'' );
        sb.append ( ", email='" ).append ( email ).append ( '\'' );
        sb.append ( ", course='" ).append ( course ).append ( '\'' );
        sb.append ( ", dateOfBirth='" ).append ( dateOfBirth ).append ( '\'' );
        sb.append ( '}' );
        return sb.toString ( );
    }

    public static void main(String[] args) {
        PrintStudentDetailsUsingTostring psd=new PrintStudentDetailsUsingTostring (
                1,
                "John Doe",
                "123 Main St, City, Country",
                "123-456-7890",
                "john@example.com",
                "Computer Science",
                "01-01-2000"
                );
        System.out.println(psd);
    }
}
