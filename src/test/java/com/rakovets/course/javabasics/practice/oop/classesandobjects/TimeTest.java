package com.rakovets.course.javabasics.practice.oop.classesandobjects;
public class TimeTest {
    public static void main (String[] args){
        // 36567 is 10 hours, 9 minutes and 27 second
        Time firstTime = new Time(36567);
        testGetMethods(firstTime);
        testSetMethods(firstTime);

        Time secondTime = new Time(2,35,20);
        testGetMethods(secondTime);
        testSetMethods(secondTime);
    }
    static void testGetMethods(Time tested){
        System.out.println("Total Seconds: " + tested.getTotalSeconds());
        System.out.println("Hours: " + tested.getHours());
        System.out.println("Minutes: " + tested.getMinutes());
        System.out.println("Seconds: " + tested.getSeconds());
    }
    static void testSetMethods(Time tested){
        tested.setHours(12);
        System.out.println("Hours after set: " + tested.getHours());
        tested.setMinutes(44);
        System.out.println("Minutes after set: " + tested.getMinutes());
        tested.setSeconds(0);
        System.out.println("Seconds after set: " + tested.getSeconds());
        System.out.println("Total Seconds after set: " + tested.getTotalSeconds());
    }
}
