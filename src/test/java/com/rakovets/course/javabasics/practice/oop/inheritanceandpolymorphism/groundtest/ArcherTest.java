package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.groundtest;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Cat;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catshome.Person;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.enemies.AngryTree;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.enemies.Dragon;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.enemies.Enemy;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.heroes.Archer;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.heroes.Hero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.swing.*;

public class ArcherTest {
    private static Enemy enemy;
    @BeforeAll
    static void init(){
        enemy = new AngryTree(70);
    }

    @Test
    void testArcherHeroWhenAlive() {
        Hero testArcherHero = new Archer("ArcherHero", 50);
        Assertions.assertEquals("ArcherHero", testArcherHero.getName());
        testArcherHero.attackEnemy(enemy);
        Assertions.assertEquals(20, enemy.getHealth());
        Assertions.assertEquals(30, testArcherHero.getHealth());
        Assertions.assertEquals(true, enemy.isAlive());
        testArcherHero.attackEnemy(enemy);
        Assertions.assertEquals(-30, enemy.getHealth());
        Assertions.assertEquals(10, testArcherHero.getHealth());
        Assertions.assertEquals(false, enemy.isAlive());
    }

    @Test
    void testArcherHeroWhenDie() {
        Hero testArcherHero = new Archer("ArcherHero", 10);
        Assertions.assertEquals("ArcherHero", testArcherHero.getName());
        testArcherHero.attackEnemy(enemy);
        Assertions.assertEquals(20, enemy.getHealth());
        Assertions.assertEquals(-10, testArcherHero.getHealth());
        Assertions.assertEquals(true, enemy.isAlive());
        Assertions.assertEquals(false, testArcherHero.isAlive());

    }
}
