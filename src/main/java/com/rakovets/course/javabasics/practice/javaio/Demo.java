package com.rakovets.course.javabasics.practice.javaio;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String ff = "/Users/yhankovich/Desktop/Koya.txt";
        FileAnalyzeUtil j  = new FileAnalyzeUtil();
      ///  j.getLengthOfString(ff);
      //  System.out.println(j.getWordsWithVowel(ff).toString());
        //System.out.println(j.getWordsWithSameLetter(ff).toString());
        //System.out.println(j.getWordFrequency(ff).toString());
       // System.out.println(j.getWordFrequencyInAscending(ff).toString());

        j.getStudentPerformance(ff);

    }
}
