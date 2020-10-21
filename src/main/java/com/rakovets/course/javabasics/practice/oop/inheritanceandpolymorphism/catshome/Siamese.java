package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome;

public class Siamese extends Cat{
    public Siamese(String name) {
        super(name);
    }

    @Override
    public void meow(Person person) {
        person.changeHappiness( -10);
        System.out.println("Miii");
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness( 10);
        System.out.println("Rrrr");
    }
}
