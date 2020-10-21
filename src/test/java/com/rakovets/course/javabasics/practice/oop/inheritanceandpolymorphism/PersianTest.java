package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Cat;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Persian;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PersianTest {

    private static Person person;
    @BeforeAll
    static void init(){
        person = new Person(10);
    }
    @Test
    void testSingleCatObject() {
        Persian cat = new Persian("Luna");
        Assertions.assertEquals("Luna", cat.getName());
        cat.setName("Nala");
        Assertions.assertEquals("Nala", cat.getName());
    }
    @Test
    void testPersianBehavior() {
        Persian pers = new Persian("Pers");
        pers.meow(person);
        Assertions.assertEquals(7, person.getHappiness());

        pers.purr(person);
        Assertions.assertEquals(13, person.getHappiness());
    }
}
