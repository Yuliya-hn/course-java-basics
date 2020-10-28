package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.studio;

import java.util.Comparator;

public class ActorAgeComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor actor1, Actor actor2) {
        return Integer.compare(actor1.getAge(), actor2.getAge());
    }
}
