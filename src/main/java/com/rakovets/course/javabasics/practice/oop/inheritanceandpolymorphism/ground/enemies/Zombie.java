package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.enemies;

public class Zombie extends Enemy {

    private boolean wasAlreadyDies = false;
    public Zombie(int health) {
        super(health, 15);
    }

    @Override
    public int takeDamage(int damage) {
        return super.takeDamage(damage);
    }

    @Override
    public boolean isAlive() {

        if (!super.isAlive() && !wasAlreadyDies) {
           this.setHealth(20);
           this.wasAlreadyDies = true;
        }

        return super.isAlive();
    }
}
