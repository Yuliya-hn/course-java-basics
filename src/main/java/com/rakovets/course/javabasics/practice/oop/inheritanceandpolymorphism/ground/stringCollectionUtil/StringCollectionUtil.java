package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.stringCollectionUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StringCollectionUtil {
    public void resetWordsByLength(Collection<String> strings, int length) {
        ArrayList<String> localArrayList = new ArrayList<>();
        localArrayList.addAll(strings);
        for (int i = 0; i < strings.size(); i++) {
            if (localArrayList.get(i).length() == length) {
                localArrayList.add(i, "*");
            }
        }
        strings.clear();
        strings.addAll(localArrayList);
    }

    public void removeWordsByLength(Collection<String> strings, int length) {
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

