package com.milest1.exceptions;

public class NullNameException extends Exception {

    public NullNameException() {
        super("Student name is null");
    }
}