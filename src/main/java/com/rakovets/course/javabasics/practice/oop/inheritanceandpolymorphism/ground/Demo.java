package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        StringCollectionUtil string = new StringCollectionUtil();
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Tom");
        strings.add("liza");
        strings.add("Sonya");
        strings.add("Karina");
        strings.add("Tim");
        strings.add("Vanya");
        strings.add("Yan");

        string.removeWordsByLength(strings,5);
        System.out.println(strings);

    }
}
