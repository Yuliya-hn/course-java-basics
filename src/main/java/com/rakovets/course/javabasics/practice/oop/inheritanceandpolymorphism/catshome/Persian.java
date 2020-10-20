package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome;

public class Persian extends Cat{
    public Persian(String name) {
        super(name);
    }

    @Override
    public void meow() {
        System.out.println("Muuu");
    }

    @Override
    public void purr() {
        System.out.println("Murr");
    }
}
