package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.groundtest;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.enemies.AngryTree;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.enemies.Dragon;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.enemies.Enemy;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.heroes.Archer;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.heroes.Hero;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.heroes.Mag;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MagVSDragon {
    private static Enemy enemy;
    @BeforeAll
    static void init(){
        enemy = new Dragon(100);
    }
    @Test
    void testMagHeroWhenAlive() {
        Hero testMagHero = new Mag("Mag",350);
        Assertions.assertEquals("Mag", testMagHero.getName());
        testMagHero.attackEnemy(enemy);
        Assertions.assertEquals(20, enemy.getHealth());
        Assertions.assertEquals(220, testMagHero.getHealth());
        Assertions.assertEquals(true, enemy.isAlive());
        testMagHero.attackEnemy(enemy);
        Assertions.assertEquals(-60, enemy.getHealth());
        Assertions.assertEquals(90, testMagHero.getHealth());
        Assertions.assertEquals(false, enemy.isAlive());
    }
    @Test
    void testMagHeroWhenDie() {
        Hero testMagHero = new Mag("Mag", 100);
        testMagHero.attackEnemy(enemy);
        Assertions.assertEquals(20, enemy.getHealth());
        Assertions.assertEquals(-30, testMagHero.getHealth());
        Assertions.assertEquals(true, enemy.isAlive());
        Assertions.assertEquals(false, testMagHero.isAlive());

    }
}
