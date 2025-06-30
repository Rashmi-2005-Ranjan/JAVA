package employeeq2.employee;

public class Employee {
    private final String empName;
    private final int salary;

    public String getEmpName() {
        return empName;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(String empName , int salary) {
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder ( "Employee{" );
        sb.append ( "empName='" ).append ( empName ).append ( '\'' );
        sb.append ( ", salary=" ).append ( salary );
        sb.append ( '}' );
        return sb.toString ( );
    }
}
