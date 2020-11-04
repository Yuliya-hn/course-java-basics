package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.customException.GetException;

public class Task7 {
    private void throwException(String message) throws GetException {
        throw new GetException(message);
    }
    public void play() throws GetException {
        int randomNumber = (int) (Math.random()*2);
        if(randomNumber == 0) {
           throwException("You are not lucky");
        }
        System.out.println("You are lucky");
    }
}
