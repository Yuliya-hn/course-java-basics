package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome;

public class Persian extends Cat{
    public Persian(String name) {
        super(name);
    }

    @Override
    public void meow(Person person) {
        person.changeHappiness( -3);
        System.out.println("Muuu");
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness( 6);
        System.out.println("Murr");
    }
}
