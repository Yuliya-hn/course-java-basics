package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Person;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Siamese;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Sphinx;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SphinxTest {
    private static Person person;
    @BeforeAll
    static void init(){
        person = new Person(50);
    }
    @Test
    void testPersianBehavior() {
        Sphinx catSphinx = new Sphinx("Kia");
        catSphinx.meow(person);
        Assertions.assertEquals(35, person.getHappiness());

        catSphinx.purr(person);
        Assertions.assertEquals(60, person.getHappiness());
    }
}
