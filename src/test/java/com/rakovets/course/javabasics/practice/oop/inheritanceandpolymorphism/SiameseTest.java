package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Persian;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Person;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Siamese;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SiameseTest {

    private static Person person;
    @BeforeAll
    static void init(){
        person = new Person(0);
    }
    @Test
    void testPersianBehavior() {
        Siamese catSiam = new Siamese("luna");
        catSiam.meow(person);
        Assertions.assertEquals(-10, person.getHappiness());

        catSiam.purr(person);
        Assertions.assertEquals(10, person.getHappiness());
    }
}
