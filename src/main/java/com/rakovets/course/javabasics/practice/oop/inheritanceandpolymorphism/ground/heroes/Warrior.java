package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.heroes;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.enemies.Enemy;

public class Warrior extends Hero {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("The Warrior [" + this.getName() + "] is attack!");
        enemy.takeDamage(100);
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

}
