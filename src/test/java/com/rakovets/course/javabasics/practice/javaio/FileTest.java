package com.rakovets.course.javabasics.practice.javaio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;

public class FileTest {

    private static String testDirPath = "src/test/java/com/rakovets/course/javabasics/practice/javaio/";

    @Test
    void testResetWordsByLength()  {
        String pathFile = testDirPath + "/Test2.txt";
        FileAnalyzeUtil fileWorker = new FileAnalyzeUtil();
        ArrayList<String> testArray = fileWorker.getLengthOfString(pathFile);

        Assertions.assertEquals("In another", testArray.get(0), "Invalid first item in parse");
        Assertions.assertEquals("hell-bent", testArray.get(testArray.size()-1), "Invalid last item in parse");
    }
    @Test
    void testWordsWithFirstVowel() {
        String pathFile = testDirPath + "/Test3.txt";
        FileAnalyzeUtil fileWorker = new FileAnalyzeUtil();
        ArrayList<String> testArray = fileWorker.getWordsWithFirstVowel(pathFile);

        Assertions.assertEquals("another", testArray.get(0), "Invalid first item in parse");
        Assertions.assertEquals("often", testArray.get(testArray.size()-1), "Invalid last item in parse");
    }
    @Test
    void testWordsWithSameLetter() {
        String pathFile = testDirPath + "/Test4.txt";
        FileAnalyzeUtil fileWorker = new FileAnalyzeUtil();
        ArrayList<String> testArray = fileWorker.getWordsWithSameLetter(pathFile);

        Assertions.assertEquals("Brady", testArray.get(0), "Invalid first item in parse");
        Assertions.assertEquals("under", testArray.get(testArray.size()-1), "Invalid last item in parse");
    }
    @Test
    void testWordFrequency() {
        String pathFile = testDirPath + "/Test6.txt";
        FileAnalyzeUtil fileWorker = new FileAnalyzeUtil();
        Map<Character,Integer> testArray= fileWorker.getWordFrequency(pathFile);

        Assertions.assertEquals(true, testArray.containsKey('a'), "The 'a' is not exist");
        Assertions.assertEquals(false, testArray.containsKey('$'), "The '$' is exist!");
        Assertions.assertEquals(3 , testArray.get('a'), "The 'a' should be 3 ");
    }

    @Test
    void testStudentPerformance() {
        String pathFile = testDirPath + "/Test9.txt";
        FileAnalyzeUtil fileWorker = new FileAnalyzeUtil();
        Map<String,Double> testArray= fileWorker.getStudentPerformance(pathFile);

        Assertions.assertEquals(true, testArray.containsKey("Olya"));
        Assertions.assertEquals(5.25 , testArray.get("Olya"));
        Assertions.assertEquals(true, testArray.containsKey("Olya"));
        Assertions.assertEquals(6.2 , testArray.get("Nina"));
    }

}
