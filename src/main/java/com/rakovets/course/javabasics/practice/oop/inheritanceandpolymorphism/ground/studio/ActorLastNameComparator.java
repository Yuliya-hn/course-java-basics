package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.studio;

import java.util.Comparator;

public class ActorLastNameComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor actor1, Actor actor2) {
        return actor1.getLastName().compareTo(actor2.getLastName());
    }
}
