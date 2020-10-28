package com.rakovets.course.javabasics.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayTest {

    Integer[] intArray = {1, 3, 4, 7, 6, 12 };
    Double[] doubleArray= {5.0, 3.4, 2.3, 2.1, 1.3};

    Array testIntMath = new Array(intArray);
    Array testDoubleMath = new Array(doubleArray);

    @Test
    void GetMaxInArray() {
        Assertions.assertEquals(12, testIntMath.getMax());
        Assertions.assertEquals(5.0, testDoubleMath.getMax());
    }

    @Test
    void getMin() {
        Assertions.assertEquals(1, testIntMath.getMin());
        Assertions.assertEquals(1.3, testDoubleMath.getMin());
    }

    @Test
    void getAverage() {
        Assertions.assertEquals(5.5, testIntMath.getAverage());
        Assertions.assertEquals(2.82, testDoubleMath.getAverage());
    }

    @Test
    void sortInAscendingOrder() {
        Assertions.assertArrayEquals(new Integer[]{1, 3, 4, 6, 7, 12}, testIntMath.sortInAscendingOrder());
        Assertions.assertArrayEquals(new Double[]{1.3, 2.1, 2.3, 3.4, 5.0}, testDoubleMath.sortInAscendingOrder());
    }

    @Test
    void sortInDescOrder() {
        Assertions.assertArrayEquals(new Integer[]{12, 7, 6, 4, 3, 1},testIntMath.sortInDescOrder());
        Assertions.assertArrayEquals(new Double[]{5.0, 3.4, 2.3, 2.1, 1.3},testDoubleMath.sortInDescOrder());
    }

    @Test
    void replace() {
        Integer[] intArray = {1, 3, 4, 7, 6, 12 };
        Double[] doubleArray= {5.0, 3.4, 2.3, 2.1, 1.3};

        Array testIntReplace = new Array(intArray);
        Array testDoubleReplace = new Array(doubleArray);

        testIntReplace.replace(4,15);
        testDoubleReplace.replace(2,6.2);

        Assertions.assertArrayEquals(new Integer[]{1, 3, 4, 7, 15, 12 },testIntReplace.getArray());
        Assertions.assertArrayEquals(new Double[]{5.0, 3.4, 6.2, 2.1, 1.3},testDoubleReplace.getArray());
    }

}
