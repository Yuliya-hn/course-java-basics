package com.rakovets.course.javabasics.practice.javaio;

import java.io.*;
import java.nio.file.Files;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public ArrayList<String> getWordsWithSameLetter(String pathFile)  {
        ArrayList<String> listOfString = this.getLengthOfString (pathFile);
        ArrayList<String> WordsWithSameLetter = new ArrayList<>();

        for (String line: listOfString) {
            String[] words = line.split(" ");
            for (int i = 0; i < words.length - 1; i++) {
                String firstWord = words[i];
                String secondWord = words[i+1];
                if (!firstWord.isEmpty() && !secondWord.isEmpty()
                        && firstWord.charAt(firstWord.length()-1) == secondWord.charAt(0)) {
                    WordsWithSameLetter.add(firstWord);
                }
            }
        }
        return WordsWithSameLetter;
    }

    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public Map <Character,Integer> getWordFrequency (String pathFile)  {
        ArrayList<String> listOfString = this.getLengthOfString (pathFile);
        Map<Character, Integer> mapOfFrequency = new HashMap<>();

        for (String line: listOfString) {
            char[] chars = line.toLowerCase().toCharArray();
            for (char symbol: chars) {
                if (!mapOfFrequency.containsKey(symbol)) {
                    mapOfFrequency.put(symbol, 0);
                }
                mapOfFrequency.put(symbol, mapOfFrequency.get(symbol)+1);
            }

        }
        return mapOfFrequency;
    }

    public Map <Character,Integer> getWordFrequencyInAscending (String pathFile)  {
         Map<Character, Integer> mapOfFrequency = this.getWordFrequency(pathFile);
         return mapOfFrequency.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue()).collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }

    public void getFileWithSortedDigit(String pathFile)  {
        try {
            ArrayList<String> lines = this.getLengthOfString (pathFile);
            ArrayList<Integer> numbers = new ArrayList<>();

            Pattern pat = Pattern.compile("[-]?[0-9]+(.[0-9]+)?");
            for (String line: lines) {
                Matcher matcher = pat.matcher(line);
                while (matcher.find()) {
                    numbers.add(Integer.valueOf(matcher.group()));
                };
            }
            numbers.sort(Integer::compareTo);
            File newFile = new File(pathFile + "_");
            newFile.createNewFile();
            FileWriter fWriter = new FileWriter(newFile);
            fWriter.write(numbers.toString());
            fWriter.flush();
            fWriter.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Map <String,Double> getStudentPerformance (String pathFile)  {
        ArrayList<String> listOfStudent = this.getLengthOfString (pathFile);
        Map<String,Double> mapOfStudent = null;
        for (String line: listOfStudent) {
            String[] words = line.split(",");
            int marks = 0;
            for(int i = 1; i < words.length; i++) {
                try {
                    marks = Integer.parseInt(words[i]);
                    marks += marks;
                }catch (NumberFormatException nfe) {
                    System.out.println("NumberFormatException: " + nfe.getMessage());
                }
                System.out.println(marks);
            }

        }
        return mapOfStudent;
    }



//    public ArrayList<String> getMaxCombinationOfNumbers(String pathFile)  {
//        ArrayList<String> listOfString = this.getLengthOfString (pathFile);
//        ArrayList<String> combinationArray = new ArrayList<>();
//        for (int i = 0; i < listOfString.size(); i++) {
//            String line = listOfString.get(i);
//            String[] numbers = line.split(" ");
//            Integer countOfCombination = 0;
//            String combination = "";
//            Double lastCombinatedNumber;
//            for (String number: numbers) {
//                if (this.isNumeric(number)) {
//                    Double theNumber = Double.valueOf(number);
//                    if (lastCombinatedNumber != null && theNumber - lastCombinatedNumber == 1) {
//                        combination += number + " ";
//                        countOfCombination ++;
//                    } else {
//                        lastCombinatedNumber = theNumber;
//                    }
//                }
//            }
//            combinationArray.add(i, combination);
//        }
//        return WordsWithSameLetter;
//    }


}
