package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.stringCollectionUtil;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StringCollectionUtilTest {
    @Test
    void testResetWordsByLength() {
        StringCollectionUtil string = new StringCollectionUtil();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Tom");
        strings.add("liza");
        strings.add("Karina");
        strings.add("Tim");
        strings.add("Sonya");
        strings.add("Vanya");
        strings.add("Yan");
        Assertions.assertArrayEquals(new Ar{} , string.resetWordsByLength(strings,5));



    }
}
