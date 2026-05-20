package oop.encapsulation.baddesign;

public class Employee {
    public String name;
    public double salary;
    public String designation;

    public Employee(String name, double salary, String designation) {
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    public String promote(){
        this.designation = "Manager";
       return "Promoted " + this.name +" to " + this.designation;
    }

    public String raiseSalary(){
        this.salary += 10000;
        return "Raised salary for " + this.name +" to " + this.salary;
    }
}
