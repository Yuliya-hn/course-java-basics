package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.customException.CustomRuntimeException;
import com.rakovets.course.javabasics.practice.exceptionhandling.customException.GetException;

public class Demo6task {
    public static void main(String[] args) {
        try {
            Task6 task6 = new Task6();
            task6.throwRandomException();
        }catch (GetException | CustomRuntimeException e ){
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
}

