package com.rakovets.course.javabasics.practice.exceptionhandling;

public class task2 {
    public static void main(String[] args) {
       try{
           int[] numbers =new int[5];
           numbers[6]=67;
       } catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Error");
       }
    }
}
