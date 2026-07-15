package collections.funcInterface;

import java.util.ArrayList;
import java.util.function.Function;

class Employee {
    int id;
    String name;
    String location;
    double salary;

    Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}

public class Assignment1 {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Rahul", "Pune", 25000));
        employees.add(new Employee(102, "Kiran", "Hyderabad", 30000));
        employees.add(new Employee(103, "Sneha", "Chennai", 28000));
        employees.add(new Employee(104, "Anjali", "Pune", 35000));
        employees.add(new Employee(105, "Ravi", "Bangalore", 32000));

        Function<Employee, String> getLocation = emp -> emp.location;

        ArrayList<String> locations = new ArrayList<>();

        for (Employee emp : employees) {
            locations.add(getLocation.apply(emp));
        }

        System.out.println("Locations:");
        locations.forEach(System.out::println);
    }
}
