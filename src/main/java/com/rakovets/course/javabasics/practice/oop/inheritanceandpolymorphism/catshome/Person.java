package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome;

public class Person {
    double happiness;
    public Person( double happiness){
        this.happiness = happiness;
    }
    public double changeHappiness(double percentHappiness){
        happiness = happiness + percentHappiness;
        return happiness;
    }
    public double getHappiness(){
        return happiness;
    }
    public void setHappiness(double happiness){
        this.happiness = happiness;
    }


}
