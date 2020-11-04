package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.customException.CustomRuntimeException;
import com.rakovets.course.javabasics.practice.exceptionhandling.customException.GetException;

public class Task6 {
    public void throwRandomException() throws GetException, CustomRuntimeException, NullPointerException {
        int randomNumber = (int) (Math.random()*1);
        switch(randomNumber) {
            case 0:
                throw new CustomRuntimeException("CustomRuntimeException");
            case 1:
                throw new GetException("GetException");
            default:
                throw new NullPointerException("NullPointerException");
        }
    }
}
