package com.rakovets.course.javabasics.practice.javaio;

public class Demo {
    public static void main(String[] args) {
        String ff = "/Users/yhankovich/Desktop/Koya.txt";
        FileAnalyzeUtil j  = new FileAnalyzeUtil();
        j.getLengthOfString(ff);
        j.getLineWithVowel(ff);
    }
}
