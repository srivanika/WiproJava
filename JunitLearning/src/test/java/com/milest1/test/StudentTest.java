package com.milest1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.milest1.Student;
import com.milest1.StudentService;
import com.milest1.exceptions.NullMarksArrayException;
import com.milest1.exceptions.NullNameException;
import com.milest1.exceptions.NullStudentException;

public class StudentTest {

    StudentService service = new StudentService();

    @Test
    public void testGradeA() throws Exception {

        Student s = new Student("Dineesha", new int[] {90, 80, 85});

        assertEquals("A", service.findGrade(s));
    }

    @Test
    public void testGradeD() throws Exception {

        Student s = new Student("Ram", new int[] {20, 25, 30});

        assertEquals("D", service.findGrade(s));
    }

    @Test
    public void testGradeF() throws Exception {

        Student s = new Student("Hari", new int[] {10, 15, 5});

        assertEquals("F", service.findGrade(s));
    }

    @Test
    public void testNullStudent() {

        assertThrows(NullStudentException.class,
                () -> service.findGrade(null));
    }

    @Test
    public void testNullName() {

        Student s = new Student(null, new int[] {80, 70, 90});

        assertThrows(NullNameException.class,
                () -> service.findGrade(s));
    }

    @Test
    public void testNullMarks() {

        Student s = new Student("Ram", null);

        assertThrows(NullMarksArrayException.class,
                () -> service.findGrade(s));
    }

    @Test
    public void testFindNullNames() {

        Student[] students = {
                new Student(null, new int[] {80}),
                new Student("Ram", new int[] {90}),
                new Student(null, new int[] {70})
        };

        assertEquals(2, service.findNumberOfNullNames(students));
    }

    @Test
    public void testFindNullObjects() {

        Student[] students = {
                null,
                new Student("Ram", new int[] {90}),
                null
        };

        assertEquals(2, service.findNumberOfNullObjects(students));
    }

    @Test
    public void testFindNullMarks() {

        Student[] students = {
                new Student("Ram", null),
                new Student("Hari", new int[] {90}),
                new Student("John", null)
        };

        assertEquals(2, service.findNumberOfNullMarks(students));
    }
}