package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome;

public class Person {
    int happiness;
    public Person( int happiness){
        this.happiness = happiness;
    }
    public int changeHappiness(int percentHappiness){
        happiness = percentHappiness;
        return happiness;
    }
    public int getHappiness(){
        return happiness;
    }
    public void setHappiness(int happiness){
        this.happiness = happiness;
    }


}
