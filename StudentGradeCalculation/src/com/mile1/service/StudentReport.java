package StudentGradeCalculation.src.com.mile1.service;

import StudentGradeCalculation.src.com.mile1.bean.Student;

import StudentGradeCalculation.src.com.mile1.exception.NullMarksArrayException;
import StudentGradeCalculation.src.com.mile1.exception.NullNameException;
import StudentGradeCalculation.src.com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    public String validate(Student student)
            throws NullStudentObjectException, NullNameException, NullMarksArrayException {

        if (student == null) {
            throw new NullStudentObjectException();
        }

        if (student.getName() == null) {
            throw new NullNameException();
        }

        if (student.getMarks() == null) {
            throw new NullMarksArrayException();
        }

        return "VALID";
    }

    public String findGrades(Student student) {

        int[] marks = student.getMarks();
        int total = 0;

        for (int mark : marks) {
            if (mark < 35) {
                return "F";
            }
            total += mark;
        }

        if (total >= 250) {
            return "A+";
        } else if (total >= 200) {
            return "A";
        } else if (total >= 150) {
            return "B";
        } else {
            return "C";
        }
    }
}