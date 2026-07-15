package collections.streamAPI;

import java.util.ArrayList;

class Student {

    int rollNo;
    String name;
    int mark;

    Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
}

public class Assignment3 {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Rahul", 75));
        students.add(new Student(2, "Anjali", 48));
        students.add(new Student(3, "Kiran", 62));
        students.add(new Student(4, "Ravi", 35));
        students.add(new Student(5, "Sneha", 90));

        long count = students.stream()
                .filter(s -> s.mark >= 50)
                .count();

        System.out.println("Students Passed = " + count);
    }
}