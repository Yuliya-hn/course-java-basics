package com.rakovets.course.javabasics.practice.generics;

public class Math<T extends Number & Comparable> {
    public T getMax(T first, T second, T third) {
        T max = this.getMax(first, second);
        return this.getMax(max, third);
    }

    private T getMax(T first, T second) {
        T max = first;
        if (second.compareTo(max) > 0) {
            max = second;
        }
        return max;
    }

    public T getMin(T first, T second, T third, T fourth, T fifth) {
        T min1 = this.getMin(first, second);
        T min2 = this.getMin(third, fourth);
        T min = this.getMin(min1, min2);
        return this.getMin(min, fifth);
    }

    private T getMin(T first, T second) {
        T min = first;
        if (second.compareTo(min) < 0) {
            min = second;
        }
        return min;
    }

    public T getMaxInArray(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = this.getMax(max, array[i]);
        }
        return max;
    }

    public T getMinInArray(T[] array) {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = this.getMin(min, array[i]);
        }
        return min;
    }

    public double getAverage(T[] array) {
       sort(array);
       double sum = 0;
       for (int i = 0; i < array.length; i++) {
           sum = sum + array[i].doubleValue();
       }
       return sum/array.length;
    }

    public T[] sort(T[] array) {
        while (true) {
            boolean sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    T temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }

            if (sorted == true) {
                break;
            }
        }
        return array;
    }

    public int binarySearchElement(T[] array, T element) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (element.compareTo(array[middle]) < 0)
                high = middle - 1;
            else if (element.compareTo(array[middle]) > 0)
                low = middle + 1;
            else
                return middle;
        }
        return -1;
    }
}

