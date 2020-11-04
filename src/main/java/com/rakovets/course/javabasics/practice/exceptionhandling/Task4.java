package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.customException.CustomRuntimeException;

public class Task4 {
    public void throwCustomRuntimeException() throws CustomRuntimeException {
        throw new CustomRuntimeException("Test RuntimeException");
    }
}
