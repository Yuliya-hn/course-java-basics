package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.heroes;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.enemies.Enemy;

public abstract class Hero implements Mortal{

    private String name;
    protected int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }


    public abstract void attackEnemy(Enemy enemy);
}
