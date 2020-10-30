package com.rakovets.course.javabasics.practice.jcf.collection;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.stringCollectionUtil.StringCollectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StringCollectionUtilTest {
    @Test
    void testResetWordsByLength() {
        StringCollectionUtil stringUtil = new StringCollectionUtil();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Tom");
        strings.add("liza");
        strings.add("Karina");
        strings.add("Tim");
        strings.add("Sonya");
        strings.add("Vanya");
        strings.add("Yan");

        stringUtil.resetWordsByLength(strings,5);

        Assertions.assertEquals("*", strings.get(4));
        Assertions.assertEquals("*", strings.get(5));
    }

    @Test
    void removeWordsByLength() {
        StringCollectionUtil stringUtil = new StringCollectionUtil();
        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("Tom");
        strings1.add("liza");
        strings1.add("Karina");
        strings1.add("Tim");
        strings1.add("Sonya");
        strings1.add("Vanya");
        strings1.add("Yan");

        stringUtil.removeWordsByLength(strings1,3);

        Assertions.assertEquals(4, strings1.size());
    }

}
