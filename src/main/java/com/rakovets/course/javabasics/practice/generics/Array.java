package com.rakovets.course.javabasics.practice.generics;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array<T extends Number & Comparable> {
    private T array[];
    private Class type;
    private Math<T> math = new Math();

    public Array(T[] array){
        this.array = array;
    }

    public Array(int length, Class type) {
        this.array = (T[]) new Number[length];
        this.type = type;
    }

    public void buildFromConsole() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите [" + i + "] элемент массива: ");
            if (this.isDouble()) {
                this.array[i] = (T) Double.valueOf(in.nextDouble());
            } else {
                this.array[i] = (T) Integer.valueOf(in.nextInt());
            }
        }
    }

    public T[] buildRandomArray() {
        Random rand = new Random();

        for (int i = 0; i < this.array.length; i++) {
            if (this.isDouble()) {
                this.array[i] = (T) Double.valueOf(rand.nextDouble() * 100);
            } else {
                this.array[i] = (T) Integer.valueOf(rand.nextInt(100));
            }
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
        return (T) math.getMaxInArray(this.array);
    }

    public T getMin() {
        return (T) math.getMinInArray(this.array);
    }

    public double getAverage() {
        return math.getAverage(this.array);
    }
    public T[] sortInAscendingOrder() {
        return (T[]) math.sort(this.array);
    }

    public T[] sortInDescOrder() {
        while (true) {
            boolean sorted = true;
            for (int i = 0; i < this.array.length - 1; i++) {
                if (this.array[i].compareTo(this.array[i + 1]) < 0) {
                    T temp = array[i];
                    this.array[i] = this.array[i + 1];
                    this.array[i + 1] = temp;
                    sorted = false;
                }
            }

            if (sorted == true) {
                break;
            }
        }
        return this.array;
    }

    public void replace(int index, T newValue) {
        this.array[index] = newValue;
    }

    private boolean isInteger() {
        return this.type == Integer.class;
    }

    private boolean isDouble() {
        return this.type == Double.class;
    }
}
