package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Cat;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CatTest {

    private static Person person;
    @BeforeAll
    static void init(){
        person = new Person(60);
    }

    @Test
    void testSingleCatObject() {
        Cat testCat = new Cat("Max");
        Assertions.assertEquals("Max", testCat.getName());
        testCat.setName("Mat");
        Assertions.assertEquals("Mat", testCat.getName());
    }
    @Test
    void testCatBehavior() {
        Cat testCat = new Cat("Mat");

        testCat.meow(person);
        Assertions.assertEquals(55, person.getHappiness());

        testCat.purr(person);
        Assertions.assertEquals(60, person.getHappiness());
    }
}
