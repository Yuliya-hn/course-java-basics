package com.rakovets.course.javabasics.practice.generics;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array<T extends Number & Comparable> {
    private T array[];
    private Math mather = new Math();

    public Array(T[] array){
        this.array = array;
    }

    public Array(int length) {
        this.array = (T[]) new Number[length];
    }

    public void buildFromConsole() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите [" + i + "] элемент массива: ");
            this.array[i] = (T) Integer.valueOf(in.nextInt());
        }
    }

    public T[] buildRandomArray() {
        Random rand = new Random();

        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = (T) Integer.valueOf(rand.nextInt(100));
        }
        return array;
    }

    public String print() {
        String returnedString = Arrays.toString(this.array);
        System.out.println(returnedString);
        return returnedString;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T getMax() {
        return (T) mather.getMaxInArray(this.array);
    }

    public T getMin() {
        return (T) mather.getMinInArray(this.array);
    }

    public double getAverage() {
        return mather.getAverage(this.array);
    }

    public void replace(int index, T newValue) {
        this.array[index] = newValue;
    }

}
