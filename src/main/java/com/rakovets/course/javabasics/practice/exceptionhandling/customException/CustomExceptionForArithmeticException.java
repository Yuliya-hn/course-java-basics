package com.rakovets.course.javabasics.practice.exceptionhandling.customException;

public class CustomExceptionForArithmeticException extends Exception{
    public CustomExceptionForArithmeticException(String message, Throwable cause) {
        super(message,cause);
    }
}
