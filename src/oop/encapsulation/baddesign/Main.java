package oop.encapsulation.baddesign;

public class Main {
    public static void main(String[] args){
        Employee employee = new Employee("Rohit", 10000, "Manager");
        System.out.println(employee.promote());
        System.out.println(employee.raiseSalary());
        employee.salary = -10000;
        employee.designation = "Engineer";
        employee.name = "Abhishek";
    }
}
