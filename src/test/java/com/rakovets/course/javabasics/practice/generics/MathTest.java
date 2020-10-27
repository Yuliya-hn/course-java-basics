package com.rakovets.course.javabasics.practice.generics;

import org.junit.jupiter.api.*;

public class MathTest {

    Math testIntMath = new Math<Integer>();
    Math testDoubleMath = new Math<Double>();

    @Test
    void GetMaxFromNumber() {
        Assertions.assertEquals(3, testIntMath.getMax(1, 2, 3));
        Assertions.assertEquals(2.3, testDoubleMath.getMax(2.3, 2.0, 2.2));
    }

    @Test
    void GetMinFromNumber() {
        Assertions.assertEquals(1, testIntMath.getMin(1, 2, 3,6,8));
        Assertions.assertEquals(1.8, testDoubleMath.getMin(2.3, 1.9, 1.8,2.0,2.1));
    }

    @Test
    void getMaxFromArray() {
        Integer[] testInt = new Integer[] {1, 2, 3};
        Assertions.assertEquals(3, testIntMath.getMaxInArray(testInt));
        Double[] testDouble = new Double[] {1.2, 1.8, 2.0};
        Assertions.assertEquals(2.0, testDoubleMath.getMaxInArray(testDouble));

    }
    @Test
    void getMinFromArray() {
        Integer[] testInt = new Integer[] {1, 2, 3};
        Assertions.assertEquals(1, testIntMath.getMinInArray(testInt));
        Double[] testDouble = new Double[] {1.2, 1.8, 2.0};
        Assertions.assertEquals(1.2, testDoubleMath.getMinInArray(testDouble));
    }
    @Test
    void  getAverage() {
        Integer[] testInt = new Integer[] {1, 2, 3};
        Assertions.assertEquals(2.0, testIntMath.getAverage(testInt));
        Double[] testDouble = new Double[] {1.2, 1.8, 2.0,1.0};
        Assertions.assertEquals(1.5, testDoubleMath.getAverage(testDouble));
    }
    @Test
    void  sort() {
        Integer[] testInt = new Integer[] {5, 6, 4, 2, 1};
        Assertions.assertArrayEquals(new Integer[]{1, 2, 4, 5, 6}, testIntMath.sort(testInt));
        Double[] testDouble = new Double[] {5.0, 5.2, 4.0, 4.3, 1.0};
        Assertions.assertArrayEquals(new Double[]{1.0, 4.0, 4.3, 5.0, 5.2}, testDoubleMath.sort(testDouble));
    }

    @Test
    void  binarySearchElement() {
        Integer[] testInt = new Integer[] {5, 6, 4, 2, 1};
        Assertions.assertEquals(2, testIntMath.binarySearchElement(testInt,4));
        Double[] testDouble = new Double[] {5.0, 5.2, 4.0, 4.3, 1.0};
        Assertions.assertEquals(2, testDoubleMath.binarySearchElement(testDouble,4.0));
    }


}
