package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.stringCollectionUtil;


import java.util.ArrayList;

public class StringCollectionUtil {
    public void resetWordsByLength(ArrayList<String> strings, int length) {
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == length) {
                strings.set(i, "*");
            }
        }
    }

    public void removeWordsByLength(ArrayList<String> strings, int length) {
        ArrayList<String> tempArray = new ArrayList<String>();
        for (String str : strings) {
            if (str.length() != length) {
                tempArray.add(str);
            }
        }
        strings.clear();
        strings.addAll(tempArray);
    }
}

