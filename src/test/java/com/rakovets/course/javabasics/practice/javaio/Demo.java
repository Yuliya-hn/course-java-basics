package com.rakovets.course.javabasics.practice.javaio;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        String pathFile ="src/test/java/com/rakovets/course/javabasics/practice/javaio/Test2.txt";
        FileAnalyzeUtil file = new FileAnalyzeUtil();
        System.out.println(file.getLengthOfString(pathFile).toString());

    }
}
