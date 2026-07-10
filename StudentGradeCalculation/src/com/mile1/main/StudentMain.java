package StudentGradeCalculation.src.com.mile1.main;

import StudentGradeCalculation.src.com.mile1.bean.Student;
import StudentGradeCalculation.src.com.mile1.exception.NullMarksArrayException;
import StudentGradeCalculation.src.com.mile1.exception.NullNameException;
import StudentGradeCalculation.src.com.mile1.exception.NullStudentObjectException;
import StudentGradeCalculation.src.com.mile1.service.StudentReport;
import StudentGradeCalculation.src.com.mile1.service.StudentService;

public class StudentMain {

    static Student data[] = new Student[4];

    public StudentMain() {

        data[0] = new Student("Sekar", new int[] {85, 75, 95});
        data[1] = new Student(null, new int[] {11, 22, 33});
        data[2] = null;
        data[3] = new Student("Manoj", null);
    }

    public static void main(String[] args) {

        StudentMain obj = new StudentMain();

        StudentReport report = new StudentReport();

        for (Student s : data) {

            try {

                if (report.validate(s).equals("VALID")) {

                    System.out.println("Grade : " + report.findGrades(s));
                }

            } catch (NullStudentObjectException e) {

                System.out.println(e);

            } catch (NullNameException e) {

                System.out.println(e);

            } catch (NullMarksArrayException e) {

                System.out.println(e);

            }
        }

        StudentService service = new StudentService();

        System.out.println();

        System.out.println("Null Marks Array : "
                + service.findNumberOfNullMarksArray(data));

        System.out.println("Null Name : "
                + service.findNumberOfNullName(data));

        System.out.println("Null Objects : "
                + service.findNumberOfNullObjects(data));
    }
}