package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для сайта посвященного астрологии:
 * Которая выводит знак зодиака и названия года по китайскому календарю, если известно:
 *
 * @param day   - число дня рождения
 * @param month - месяц дня рождения
 * @param year  - год дня рождения (больше 0 г. н.э. и нет никаких циклических смещений)
 *
 * 21.3-20.4 - `Ram`
 * 21.4-20.5 - `Bull`
 * 21.5-21.6 - `Twins`
 * 22.6-22.7 - `Crab`
 * 23.7-22.8 - `Lion`
 * 23.8-21.9 - `Maiden`
 * 22.9-22.10 - `Scales`
 * 23.10-22.11 - `Scorpion`
 * 23.11-21.12 - `Archer`
 * 22.12-20.1 - `Goat`
 * 21.1-19.2 - `Water-bearer`
 * 20.2-20.3 - `Fish`
 *
 * 2001 - `Snake`
 * 2002 - `Horse`
 * 2003 - `Ram`
 * 2004 - `Monkey`
 * 2005 - `Rooster`
 * 2006 - `Dog`
 * 2007 - `Pig`
 * 2008 - `Rat`
 * 2009 - `Ox`
 * 2010 - `Tiger`
 * 2011 - `Rabbit`
 * 2012 - `Dragon`
 *
 * @return 'Zodiac Sign: {0}. Chinese Zodiac: {1}', где {0} - знак зодиака, {1} - год зодиака
 */
public class Task12 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int day = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[0]);
        int month = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[1]);
        int year = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[2]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        String zodiacSign = getZodiacSign(day, month);
        String chineseZodiac = getChineseZodiac(year);
        System.out.println(String.format("Zodiac Sign: %s. Chinese Zodiac: %s", zodiacSign, chineseZodiac));

    }
    static String getZodiacSign(int day, int month) {
        int resultDayAndMonth = (month * 100) + day;
        String zodiacSign;

        if(resultDayAndMonth >= 121 && resultDayAndMonth <= 219){
            zodiacSign = "Water-bearer";
        } else if(resultDayAndMonth >= 220 && resultDayAndMonth <= 320){
            zodiacSign = "Fish";
        } else if(resultDayAndMonth >= 321 && resultDayAndMonth <= 420){
            zodiacSign = "Ram";
        } else if(resultDayAndMonth >= 421 && resultDayAndMonth <= 520){
            zodiacSign = "Bull";
        } else if(resultDayAndMonth >= 521 && resultDayAndMonth <= 621){
            zodiacSign = "Twins";
        } else if(resultDayAndMonth >= 622 && resultDayAndMonth <= 722){
            zodiacSign = "Crab";
        } else if(resultDayAndMonth >= 723 && resultDayAndMonth <= 822){
            zodiacSign = "Lion";
        } else if(resultDayAndMonth >= 823 && resultDayAndMonth <= 921){
            zodiacSign = "Maiden";
        } else if(resultDayAndMonth >= 922 && resultDayAndMonth <= 1022){
            zodiacSign = "Scales";
        } else if(resultDayAndMonth >= 1023 && resultDayAndMonth <= 1122){
            zodiacSign = "Scorpion";
        } else if(resultDayAndMonth >= 1123 && resultDayAndMonth <= 1221) {
            zodiacSign = "Archer";
        } else {
            zodiacSign = "Goat";
        }
        return zodiacSign;
    }
    static String getChineseZodiac(int year) {
        String chineseZodiac;
        if (year % 12 == 11) {
            chineseZodiac = "Ram";
        } else if (year % 12 == 10) {
            chineseZodiac = "Horse";
        } else if (year % 12 == 9) {
            chineseZodiac = "Snake";
        } else if (year % 12 == 8){
            chineseZodiac = "Dragon";
        } else if (year % 12 == 7){
            chineseZodiac = "Rabbit";
        } else if (year % 12 == 6) {
            chineseZodiac = "Tiger";
        } else if (year % 12 == 5) {
            chineseZodiac = "Ox";
        } else if (year % 12 == 4) {
            chineseZodiac = "Rat";
        } else if (year % 12 == 3) {
            chineseZodiac = "Pig";
        } else if (year % 12 == 2) {
            chineseZodiac = "Dog";
        } else if (year % 12 == 1) {
            chineseZodiac = "Rooster";
        } else {
            chineseZodiac = "Monkey";
        }

        return chineseZodiac;
    }

}