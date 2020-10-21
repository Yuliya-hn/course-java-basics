package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome;

public class Sphinx extends Cat{
    public Sphinx(String name) {
        super(name);
    }
    @Override
    public void meow(Person person) {
        person.changeHappiness( - 15);
        System.out.println("Myaso");
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness( 10);
        System.out.println("Kurrr");
    }
}
