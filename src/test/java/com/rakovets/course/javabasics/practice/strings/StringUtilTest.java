package com.rakovets.course.javabasics.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StringUtilTest {
    private static StringUtil string;
    @BeforeAll
    static void init(){
        string = new StringUtil();

    }
    @Test
    void getGlueStringTest(){
        Assertions.assertEquals("Helloworld",string.getGlueString("Hello","world"));
        Assertions.assertEquals("Hello",string.getGlueString("Hello",""));
        Assertions.assertEquals("Hello world",string.getGlueString("Hello ","world"));
    }
    @Test
    void getIndexOfSymbolTest(){
        Assertions.assertEquals("ы",string.getIndexOfSymbol("k"));
    }
    @Test
    void getEqualStringTest(){
        Assertions.assertEquals(true,string.getEqualString("mood","mood"));
        Assertions.assertEquals(true,string.getEqualString("my mood","my mood"));
        Assertions.assertEquals(false,string.getEqualString("mood","MOOD"));
        Assertions.assertEquals(false,string.getEqualString("mood","MoOd"));
        Assertions.assertEquals(false,string.getEqualString("mood",""));
        Assertions.assertEquals(true,string.getEqualString("123","123"));
    }
    @Test
    void getUpperCaseStringAndTrimTest(){
        Assertions.assertEquals("WORLD",string.getUpperCaseStringAndTrim(" world "));
        Assertions.assertEquals("WORLD",string.getUpperCaseStringAndTrim("WoRld "));
        Assertions.assertEquals("WORLD",string.getUpperCaseStringAndTrim(" WORLD"));
        Assertions.assertEquals("HELLO WORLD",string.getUpperCaseStringAndTrim("  Hello world  "));
        Assertions.assertEquals("",string.getUpperCaseStringAndTrim(""));
        Assertions.assertEquals("WORLD",string.getUpperCaseStringAndTrim(" world "));
    }
    @Test
    void getSubStringTest(){
        Assertions.assertEquals("2345678912345",string.getSubString("12345678912345678912345"));
    }
    @Test
    void changeSmileTest(){
        Assertions.assertEquals("Hello:)",string.changeSmile("Hello:("));
        Assertions.assertEquals("Hello:)",string.changeSmile("Hello:)"));
        Assertions.assertEquals("Hello )",string.changeSmile("Hello )"));
        Assertions.assertEquals("Hello :",string.changeSmile("Hello :"));
    }
    @Test
    void isWordBeginAndEndOfStringTest(){
        Assertions.assertEquals(true,string.isWordBeginAndEndOfString("hello world hello","hello"));
        Assertions.assertEquals(true,string.isWordBeginAndEndOfString("hello","hello"));
        Assertions.assertEquals(false,string.isWordBeginAndEndOfString("Hello world hello","hello"));
        Assertions.assertEquals(true,string.isWordBeginAndEndOfString("",""));


    }
    @Test
    void howManyVowelsTest(){
        Assertions.assertEquals( 6,string.getCountOfVowels("hello my supr pizza"));
        Assertions.assertEquals( 7,string.getCountOfVowels("hello my super pizza"));
        Assertions.assertEquals( 0,string.getCountOfVowels("hll m spr pzz"));
    }
    @Test
    void howManySymbolsTest(){
        Assertions.assertEquals( 3,string.getCountOfSymbols("hello, my super pizza.!"));
        Assertions.assertEquals( 5,string.getCountOfSymbols("hello, my super pizza.!!!"));
        Assertions.assertEquals( 0,string.getCountOfSymbols("hello my super pizza"));
    }
    @Test
    void isWordPalindromeTest(){
        Assertions.assertEquals( false,string.isWordPalindrome("hello"));
        Assertions.assertEquals( true,string.isWordPalindrome("Анна"));
    }
    @Test
    void getStringArrayTest(){
        Assertions.assertEquals(true, Arrays.equals(new String[] {"he", "ll", " w", "or", "ld"}, string.getStringArray("hell world", 2)));
    }
    @Test
    void getAbbreviationTest(){
        Assertions.assertEquals( "H.Y.D",string.getAbbreviation("Yuliya","Hankovich","dref"));
    }
    @Test
    void getDigitSetFromStringTest(){
        Assertions.assertEquals( "6754562340",string.getDigitSetFromString("khjk 675 456jhkhkh2340"));
    }

    @Test
    void getUniqueCharactersTest(){
        Assertions.assertEquals( "п е с с и н ф м а и я",string.getUniqueCharacters("процессор", "информация"));
        Assertions.assertEquals( "",string.getUniqueCharacters("test", "test"));
    }

}
