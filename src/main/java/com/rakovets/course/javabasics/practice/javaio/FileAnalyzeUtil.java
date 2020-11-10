package com.rakovets.course.javabasics.practice.javaio;

import java.io.*;
import java.util.ArrayList;

public class FileAnalyzeUtil {

    public ArrayList<String> getLengthOfString(String pathFile)  {
        ArrayList<String> listOfString = new ArrayList<String>();
        try {
            File file = new File(pathFile);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                listOfString.add(line);
                System.out.println(line);
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

    public ArrayList<String> getLineWithVowel(String pathFile)  {
        ArrayList<String> listOfString = new ArrayList<String>();
        try {
            File file = new File(pathFile);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                if (this.isVowel(line.charAt(0))) {
                    listOfString.add(line);
                    System.out.println(line);
                }
                line = reader.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return listOfString;
    }
}
