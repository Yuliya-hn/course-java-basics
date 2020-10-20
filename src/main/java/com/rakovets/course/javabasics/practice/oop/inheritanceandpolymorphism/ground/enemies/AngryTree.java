package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.enemies;

public class AngryTree extends Enemy{

    public AngryTree(int health, int returnDamage) {
        super(health, 65);
    }

    @Override
    public int takeDamage(int damage) {
        return super.takeDamage(damage);
    }
}
