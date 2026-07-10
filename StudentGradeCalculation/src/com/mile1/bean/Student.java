package StudentGradeCalculation.src.com.mile1.bean;

public class Student {

    private String name;
    private int[] marks;
    private String grade;

    // Default Constructor
    public Student() {

    }

    // Parameterized Constructor
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for marks
    public int[] getMarks() {
        return marks;
    }

    // Setter for marks
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    // Getter for grade
    public String getGrade() {
        return grade;
    }

    // Setter for grade
    public void setGrade(String grade) {
        this.grade = grade;
    }
}