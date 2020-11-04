package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task1 {
    public static void main(String[] args) {
        String str = null;
        try {
        str.length();
        } catch (NullPointerException e) {
            System.out.println("Произошла NullPointerException");
        };
    }
}
