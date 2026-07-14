package IOstreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class EmployeeSerialization {

    public static void main(String[] args) {

        try {

            Employee emp = new Employee(
                    "Sudhir",
                    new Date(),
                    "IT",
                    "Software Engineer",
                    75000.0);

            FileOutputStream fos = new FileOutputStream("data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(emp);

            oos.close();
            fos.close();

            System.out.println("Employee object serialized successfully.");

            FileInputStream fis = new FileInputStream("data");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee employee = (Employee) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("\nEmployee Details");
            System.out.println("-------------------------");
            System.out.println("Name        : " + employee.getName());
            System.out.println("Date of Birth : " + employee.getDateOfBirth());
            System.out.println("Department  : " + employee.getDepartment());
            System.out.println("Designation : " + employee.getDesignation());
            System.out.println("Salary      : " + employee.getSalary());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}