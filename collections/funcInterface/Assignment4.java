package collections.funcInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {

    private int id;
    private String name;
    private double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Assignment4 {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Rahul", 8000));
        employees.add(new Employee(102, "Kiran", 12000));
        employees.add(new Employee(103, "Sneha", 9500));
        employees.add(new Employee(104, "Anjali", 18000));
        employees.add(new Employee(105, "Ravi", 7000));

        Predicate<Employee> lowSalary = emp -> emp.getSalary() < 10000;

        System.out.println("Employees with salary less than 10000:");

        employees.stream()
                .filter(lowSalary)
                .forEach(emp -> System.out.println(emp.getName()));
    }
}
