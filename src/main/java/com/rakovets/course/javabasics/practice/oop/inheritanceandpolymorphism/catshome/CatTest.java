package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome;

public class CatTest {
    public static void main(String[] ars){
        Sphinx n = new Sphinx("ht");
        n.meow();
        n.purr();
        Persian h = new Persian("Lox");
        h.meow();
        h.purr();
        Cat k = new Cat("Van");
        k.meow();
        k.purr();

    }
}
