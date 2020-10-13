package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    Time(int totalSeconds) {
        totalSeconds =0;
    }

    // Time myTime1 = new Time(0, 0, 20);
    Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // myTime1.getHours();
    public int getHours() {
        return this.hours;
    }

    // myTime1.setHours(2);
    public void setHours(int hours) {
        //check hours < 1000
        this.hours = hours;
    }
    public int getMinutes(){
        return this.minutes;
    }
    public void setMinutes(int minutes){
        this.minutes = minutes;
    }
    public int getSeconds(){
        return this.seconds;
    }
    public void setSeconds(int seconds){
        this.seconds =seconds;
    }
    public int getTotalSeconds(){
        return totalSeconds;
    }
}
