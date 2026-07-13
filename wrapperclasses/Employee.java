package wrapperclasses;

public class Employee implements Cloneable {

    private int empId;
    private String empName;
    private double salary;

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
        System.out.println();
    }
}