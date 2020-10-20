package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.enemies;

public class Dragon extends Enemy{

    public Dragon(int health, int returnDamage) {
        super(health, 130);
    }

    @Override
    public int takeDamage(int damage) {
        return super.takeDamage(damage);
    }
}
