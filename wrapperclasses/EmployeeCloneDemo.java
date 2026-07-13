package wrapperclasses;

public class EmployeeCloneDemo {

    public static void main(String[] args) {

        try {

            Employee original = new Employee(101, "Srivani", 50000);

            Employee clone = (Employee) original.clone();

            original.setEmpName("Anjali");
            original.setSalary(65000);

            System.out.println("Original Employee");
            original.display();

            System.out.println("Cloned Employee");
            clone.display();

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}