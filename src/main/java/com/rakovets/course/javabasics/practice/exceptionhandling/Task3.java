package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.customException.GetException;

public class Task3 {
    public void throwGetException() throws GetException {
        throw new GetException("Test Error");
    }
}


