package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome;

public class Sphinx extends Cat{
    public Sphinx(String name) {
        super(name);
    }
    @Override
    public void meow() {
        System.out.println("Myaso");
    }

    @Override
    public void purr() {
        System.out.println("Kurrr");
    }
}
