package collections;

import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

public class EmployeeVector {

    public static void main(String[] args) {

        Vector<Employee> employees = new Vector<>();

        employees.add(new Employee(101, "Rahul", "rahul@gmail.com", "Male", 50000));
        employees.add(new Employee(102, "Priya", "priya@gmail.com", "Female", 60000));
        employees.add(new Employee(103, "Amit", "amit@gmail.com", "Male", 55000));

        System.out.println("Displaying Employees using Iterator:\n");

        Iterator<Employee> itr = employees.iterator();

        while (itr.hasNext()) {
            Employee emp = itr.next();
            emp.GetEmployeeDetails();
            System.out.println("------------------------");
        }

        System.out.println("\nDisplaying Employees using Enumeration:\n");

        Enumeration<Employee> en = employees.elements();

        while (en.hasMoreElements()) {
            Employee emp = en.nextElement();
            emp.GetEmployeeDetails();
            System.out.println("------------------------");
        }
    }
}