package oop.encapsulation.gooddesign;

public class Main {

    public static void main(String[] args){
        Employee employee = new Employee("Rohit", 1000000, "Manager");
        System.out.println( employee.promote("Senior Manager"));
        employee.increaseSalary(200000);
        System.out.println("Salary : "+ employee.getSalary());
    }
}
