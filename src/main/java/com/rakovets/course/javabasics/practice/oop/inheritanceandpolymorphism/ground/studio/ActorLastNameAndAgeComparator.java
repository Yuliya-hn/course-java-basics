package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.studio;

import java.util.Comparator;

public class ActorLastNameAndAgeComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor actor1, Actor actor2) {
        int result = actor1.getLastName().compareTo(actor2.getLastName());

        if (result == 0) {
            result = Integer.compare(actor1.getAge(), actor2.getAge());
        }

        return result;
    }
}
