package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome;

public class Siamese extends Cat{
    public Siamese(String name) {
        super(name);
    }

    @Override
    public void meow() {
        System.out.println("Miii");
    }

    @Override
    public void purr() {
        System.out.println("Rrrr");
    }
}
