package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.customException.CustomExceptionForArithmeticException;
import com.rakovets.course.javabasics.practice.exceptionhandling.customException.CustomRuntimeException;

public class Demo5task {
    public static void main(String[] args) throws CustomExceptionForArithmeticException {
        try {
            int i = 9/0;
        } catch (ArithmeticException e){
           throw new CustomExceptionForArithmeticException(e.getMessage(),e.getCause());
        }
    }
}
