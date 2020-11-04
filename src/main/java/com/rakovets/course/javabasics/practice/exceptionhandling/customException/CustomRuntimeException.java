package com.rakovets.course.javabasics.practice.exceptionhandling.customException;

public class CustomRuntimeException extends RuntimeException {

    public CustomRuntimeException(String message) {
        super(message);
    }
}
