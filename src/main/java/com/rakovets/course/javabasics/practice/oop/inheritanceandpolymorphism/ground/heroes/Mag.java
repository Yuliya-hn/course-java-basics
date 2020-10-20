package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.heroes;


import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.enemies.Enemy;

public class Mag extends Hero {

    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("The Mag [" + this.getName() + "] is attack!");
        enemy.takeDamage(80);
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

}
