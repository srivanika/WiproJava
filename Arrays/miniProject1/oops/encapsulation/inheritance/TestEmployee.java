package Arrays.miniProject1.oops.encapsulation.inheritance;

public class TestEmployee {

    public static void main(String[] args) {

        Employee emp = new Employee(
                "Srivani",
                500000,
                2026,
                "NI123456");

        System.out.println("Employee Details");
        System.out.println("-------------------------");
        System.out.println("Name : " + emp.getName());
        System.out.println("Annual Salary : " + emp.getAnnualSalary());
        System.out.println("Year Started : " + emp.getYearStarted());
        System.out.println("National Insurance Number : "
                + emp.getNationalInsuranceNumber());
    }
}