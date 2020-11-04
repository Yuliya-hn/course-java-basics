package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.customException.CustomRuntimeException;

public class Demo4task {
    public static void main(String[] args) {
        try {
            Task4 task4 = new Task4();
            task4.throwCustomRuntimeException();
        } catch (CustomRuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
