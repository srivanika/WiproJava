package collections.miniproject;
public class Employee {

    private String firstName;
    private String lastName;
    private long mobileNumber;
    private String email;
    private String address;

    public Employee(String firstName, String lastName, long mobileNumber, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}