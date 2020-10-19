package com.rakovets.course.javabasics.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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
        Assertions.assertEquals(false,string.getEqualString("mood","MOOD"));
        Assertions.assertEquals(false,string.getEqualString("mood","MoOd"));
        Assertions.assertEquals(false,string.getEqualString("mood",""));
    }
    @Test
    void getUpperCaseStringAndTrimTest(){
        Assertions.assertEquals("WORLD",string.getUpperCaseStringAndTrim(" world "));
        Assertions.assertEquals("WORLD",string.getUpperCaseStringAndTrim("WoRld "));
        Assertions.assertEquals("WORLD",string.getUpperCaseStringAndTrim(" WORLD"));
        Assertions.assertEquals("HELLO WORLD",string.getUpperCaseStringAndTrim("  Hello world  "));
    }
    @Test
    void getSubStringTest(){
        Assertions.assertEquals("WORLD",string.getSubString("sslslldlelell"));
        Assertions.assertEquals("WORLD",string.getSubString("dkslx,cmvlee "));
    }
    @Test
    void changeSmileTest(){
        Assertions.assertEquals("Hello:)",string.changeSmile("Hello:("));
        Assertions.assertEquals("Hello:)",string.changeSmile("Hello:)"));
        Assertions.assertEquals("Hello )",string.changeSmile("Hello )"));

    }
    @Test
    void chadngeSmileTest(){
        Assertions.assertEquals("Hello:)",string.changeSmile("Hello:("));
        Assertions.assertEquals("Hello:)",string.changeSmile("Hello:)"));
        Assertions.assertEquals("Hello )",string.changeSmile("Hello )"));

    }
    @Test
    void howManyVowelsTest(){
        Assertions.assertEquals( 3,string.getCountOfVowels("deloo"));
    }
    @Test
    void howManySymbolsTest(){
        Assertions.assertEquals( 4,string.getCountOfSymbols("deloo,ss,ss! !"));
    }
    @Test
    void isWordPalindromeTest(){
        Assertions.assertEquals( false,string.isWordPalindrome("hello"));
        Assertions.assertEquals( true,string.isWordPalindrome("Анна"));
    }
    @Test
    void getStringArrayTest(){
        Assertions.assertEquals(new String[] {"he", "ll", " w", "or", "ld"}, string.getStringArray("hell world", 2));
    }




}
