package StudentGradeCalculation.src.com.mile1.service;

import StudentGradeCalculation.src.com.mile1.bean.Student;

public class StudentService {

    // Count the number of students whose marks array is null
    public int findNumberOfNullMarksArray(Student[] data) {

        int count = 0;

        for (Student s : data) {
            if (s != null && s.getMarks() == null) {
                count++;
            }
        }

        return count;
    }

    // Count the number of students whose name is null
    public int findNumberOfNullName(Student[] data) {

        int count = 0;

        for (Student s : data) {
            if (s != null && s.getName() == null) {
                count++;
            }
        }

        return count;
    }

    // Count the number of null student objects
    public int findNumberOfNullObjects(Student[] data) {

        int count = 0;

        for (Student s : data) {
            if (s == null) {
                count++;
            }
        }

        return count;
    }
}