package com.rakovets.course.javabasics.practice.generics;

import java.util.Arrays;

public class DemoOfArrayInput {
    public static void main(String[] args) {
        Array<Integer> intArray1 = new Array<>(5, Integer.class);
        intArray1.buildRandomArray();
        intArray1.print();

        Array<Double> intArray2 = new Array<>(5, Double.class);
        intArray2.buildRandomArray();
        intArray2.print();


        Array<Integer> intArray = new Array<>(5, Integer.class);
        intArray.buildFromConsole();
        intArray.print();

        Array<Double> doubleArray = new Array<>(5, Double.class);
        doubleArray.buildFromConsole();
        doubleArray.print();

    }
}
