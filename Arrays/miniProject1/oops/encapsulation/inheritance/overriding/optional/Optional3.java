package Arrays.miniProject1.oops.encapsulation.inheritance.overriding.optional;

import java.util.Optional;

public class Optional3 {

    public static void main(String[] args) {

        Employee employee = null;

        try {

            Employee emp = Optional.ofNullable(employee)
                    .orElseThrow(() ->
                            new InvalidEmployeeException("Invalid Employee"));

            System.out.println("Employee Name: " + emp.getName());

        } catch (InvalidEmployeeException e) {

            System.out.println(e.getMessage());

        }
    }
}