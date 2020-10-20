package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.heroes;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.enemies.Enemy;

public class Archer extends Hero {

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("The Archer [" + this.getName() + "] is attack!");
        enemy.takeDamage(50);
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }
}
