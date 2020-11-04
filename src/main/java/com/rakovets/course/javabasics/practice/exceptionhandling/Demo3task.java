package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.customException.GetException;

public class Demo3task {
    public static void main(String[] args) {
       try {
           Task3 task3 = new Task3();
           task3.throwGetException();
       } catch (GetException e){
           System.out.println(e.getStackTrace());
           System.out.println(e.getMessage());

       }
    }
}
