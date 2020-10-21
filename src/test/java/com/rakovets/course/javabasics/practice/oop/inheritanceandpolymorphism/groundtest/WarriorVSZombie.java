package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.groundtest;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.enemies.Dragon;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.enemies.Enemy;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.enemies.Zombie;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.heroes.Hero;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.heroes.Mag;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.heroes.Warrior;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class WarriorVSZombie {
    private static Enemy enemy;
    @BeforeAll
    static void init(){
        enemy = new Zombie(200);
    }
    @Test
    void testWarriorHeroWhenAlive() {
        Hero testWarriorHero = new Warrior("Warrior",200);
        Assertions.assertEquals("Warrior",testWarriorHero.getName());
        testWarriorHero.attackEnemy(enemy);
        Assertions.assertEquals(100, enemy.getHealth());
        Assertions.assertEquals(185, testWarriorHero.getHealth());
        Assertions.assertEquals(true, enemy.isAlive());
        testWarriorHero.attackEnemy(enemy);
        Assertions.assertEquals(0, enemy.getHealth());
        Assertions.assertEquals(170, testWarriorHero.getHealth());
        Assertions.assertEquals(true, enemy.isAlive());
        testWarriorHero.attackEnemy(enemy);
        Assertions.assertEquals(-80, enemy.getHealth());
        Assertions.assertEquals(155, testWarriorHero.getHealth());
        Assertions.assertEquals(false, enemy.isAlive());

    }
   @Test
    void testWarriorHeroWhenDie() {
        Hero testWarriorHero = new Warrior("Warrior",15);
        testWarriorHero.attackEnemy(enemy);
        Assertions.assertEquals(100, enemy.getHealth());
        Assertions.assertEquals(0, testWarriorHero.getHealth());
        Assertions.assertEquals(false, testWarriorHero.isAlive());
    }
}
