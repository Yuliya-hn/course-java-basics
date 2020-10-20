package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.enemies;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.heroes.Mortal;

public abstract class Enemy implements Mortal {

    private int health;
    protected int returnedDamage;

    public Enemy(int health, int returnedDamage) {
        this.health = health;
        this.returnedDamage = returnedDamage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int takeDamage(int damage) {
        this.health -= damage;
        return this.returnedDamage;
    }

    @Override
    public boolean isAlive() {
        return false;
    }

}
