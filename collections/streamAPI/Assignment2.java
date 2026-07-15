package collections.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

    int empNo;
    String name;
    int age;
    String location;

    Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String toString() {
        return empNo + " " + name + " " + age + " " + location;
    }
}

public class Assignment2 {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Rahul", 24, "Pune"));
        employees.add(new Employee(102, "Anjali", 22, "Hyderabad"));
        employees.add(new Employee(103, "Kiran", 25, "Pune"));
        employees.add(new Employee(104, "Ravi", 26, "Chennai"));
        employees.add(new Employee(105, "Sneha", 23, "Pune"));

        List<Employee> puneEmployees = employees.stream()
                .filter(emp -> emp.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        System.out.println("Employees from Pune:");

        puneEmployees.forEach(System.out::println);
    }
}