package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.enemies;

public class AngryTree extends Enemy{

    public AngryTree(int health) {
        super(health, 20);
    }

    @Override
    public int takeDamage(int damage) {
        return super.takeDamage(damage);
    }
}
