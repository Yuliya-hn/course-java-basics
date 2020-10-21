package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome;

public class Cat {
    private String name;
    public Cat(String name1){
        name = name1;
    }
    public void meow(Person person){
        person.changeHappiness( -5);
       System.out.println("Meow");
    }
    public void purr(Person person){
        person.changeHappiness( 5);
        System.out.println("Purr");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
