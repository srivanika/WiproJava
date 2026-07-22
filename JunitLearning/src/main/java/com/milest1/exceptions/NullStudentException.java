package com.milest1.exceptions;

public class NullStudentException extends Exception {

    public NullStudentException() {
        super("Student object is null");
    }
}