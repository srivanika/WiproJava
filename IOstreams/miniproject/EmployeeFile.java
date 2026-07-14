package IOstreams.miniproject;
import java.io.*;
public class EmployeeFile {

    private final String fileName = "employee.txt";

    public void addEmployee(Employee emp) {

        try {
            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(emp.getId() + "," + emp.getName() + "," + emp.getAge() + "," + emp.getSalary());
            bw.newLine();

            bw.close();

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    public void displayEmployees() {

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String line;

            System.out.println("----Report----");

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                System.out.println(data[0] + " " + data[1] + " " + data[2] + " " + data[3]);
            }

            System.out.println("----End of Report----");

            br.close();

        } catch (IOException e) {
            System.out.println("No employee records found.");
        }
    }
}