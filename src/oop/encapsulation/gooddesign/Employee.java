package oop.encapsulation.gooddesign;

public class Employee {

    private String name;
    private double salary;
    private String designation;

    public Employee(String name, double salary, String designation) {

        if(salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }

        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    public void increaseSalary(double amount) {

        if(amount <= 0) {
            throw new IllegalArgumentException("Invalid increment amount");
        }

        salary += amount;
    }

    public String promote(String newDesignation) {

        this.designation = newDesignation;

        return "Promoted " + this.name + " to " + this.designation;
    }

    public double getSalary() {
        return salary;
    }
}