package com.rakovets.course.javabasics.practice.javaio;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String ff = "/Users/yhankovich/Desktop/Koya.txt";
        FileAnalyzeUtil j  = new FileAnalyzeUtil();
      ///  j.getLengthOfString(ff);
        System.out.println(j.getWordsWithVowel(ff).toString());
    }
}
