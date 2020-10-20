package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome;

public class Cat {
    String name;
    public Cat( String name1){
        name = name1;
    }
    public void meow(){
       System.out.println("Meow");
    }
    public void purr(){
        System.out.println("Purr");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
