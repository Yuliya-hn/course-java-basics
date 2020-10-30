package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.stringCollectionUtil;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        StringCollectionUtil string = new StringCollectionUtil();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Tom");
        strings.add("liza");
        strings.add("Karina");
        strings.add("Tim");
        strings.add("Sonya");
        strings.add("Vanya");
        strings.add("Yan");

        string.removeWordsByLength(strings,5);
        System.out.println(strings);

    }
}
