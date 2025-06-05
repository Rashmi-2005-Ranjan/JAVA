package org.employee;

public class TestClass {
    public static void main(String[] args) {
        Employee employee = new Employee("Prashant", 30, 50000.0);
        String details=employee.getEmployeeDetails ();
        System.out.println(details);
        employee.setName("Golu");
        employee.setAge(35);
        employee.setSalary(60000.0);
        System.out.println("Updated Employee Details:"+ " " + employee.getEmployeeDetails());
    }
}
