package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.customException.GetException;

public class Demo7 {
    public static void main(String[] args) {
        System.out.println("Program is started");
        try {
            Task7 task7 = new Task7();
            task7.play();
        }catch (GetException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Program was finished");
        }
    }
}
