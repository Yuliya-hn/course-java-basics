package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground;

import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.Random;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        ParallelCalculator calculator = new ParallelCalculator();

        ArrayList<Integer[]> listOfArray = calculator.generateListOfArrays(20000);

        long startTime1 = System.currentTimeMillis();
        calculator.getMaxFromArrays(listOfArray);
        long finishTime1 = System.currentTimeMillis();
        System.out.println("Was spent: " + (finishTime1-startTime1));

        long startTime2 = System.currentTimeMillis();
        calculator.runInParallel(2,listOfArray);
        long finishTime2 = System.currentTimeMillis();
        System.out.println("Was spent: " + (finishTime2-startTime2));

        long startTime3 = System.currentTimeMillis();
        calculator.runInParallel(5,listOfArray);
        long finishTime3 = System.currentTimeMillis();
        System.out.println("Was spent: " + (finishTime3-startTime3));

        long startTime = System.currentTimeMillis();
        calculator.runInParallel(10,listOfArray);
        long finishTime = System.currentTimeMillis();
        System.out.println("Was spent: " + (finishTime-startTime));

    }

}
