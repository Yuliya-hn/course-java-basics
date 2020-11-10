package com.rakovets.course.javabasics.practice.javaio;

import java.io.*;
import java.util.ArrayList;

public class FileAnalyzeUtil {

    public ArrayList<String> getLengthOfString(String pathFile)  {
        ArrayList<String> listOfString = new ArrayList<>();
        try {
            File file = new File(pathFile);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                listOfString.add(line);
                line = reader.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return listOfString;
    }

    public boolean isVowel(char c) {
        char[] vowels = { 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U', 'y', 'Y' };
        for (char vowel : vowels) {
            if (c == vowel) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> getWordsWithVowel(String pathFile)  {
        ArrayList<String> listOfString = this.getLengthOfString (pathFile);
        ArrayList<String> wordsWithVowel = new ArrayList<>();
        for (String line: listOfString) {
            String[] words = line.split(" ");

            for (String word: words) {
                if (!word.isEmpty() && this.isVowel(word.charAt(0))) {
                    wordsWithVowel.add(word);
                }
            }
        }
        return wordsWithVowel;
    }
}
