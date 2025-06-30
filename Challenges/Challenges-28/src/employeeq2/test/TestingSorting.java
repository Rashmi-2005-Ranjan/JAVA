package employeeq2.test;

import employeeq2.employee.Employee;

import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> employees = List.of (
                new Employee ( "Prashant" , 50000 ) ,
                new Employee ( "Harish" , 45000 ) ,
                new Employee ( "Ramesh" , 89000 ) ,
                new Employee ( "Mukesh" , 35000 ) ,
                new Employee ( "Ganesh" , 96000 ) ,
                new Employee ( "Raman" , 25000 )
        );

        employees
                .stream ()
                .sorted ( (emp1,emp2)->Integer.compare ( emp1.getSalary (),emp2.getSalary ()) )
                .forEach ( System.out::println );
    }
}
