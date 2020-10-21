package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.enemies;

public class Zombie extends Enemy {

    public Zombie(int health) {
        super(health, 15);
    }

    @Override
    public int takeDamage(int damage) {
        return super.takeDamage(damage);
    }

    @Override
    public boolean isAlive() {

        if (!super.isAlive() && Math.random() < 0.5) {
           this.setHealth(1);
        }

        return super.isAlive();
    }
}
