package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.studio;

import java.util.Comparator;

public class ActorFeeAndLastNameComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor actor1, Actor actor2) {
        int result = Double.compare(actor1.getFee(), actor2.getFee());

        if (result == 0) {
            result = actor1.getLastName().compareTo(actor2.getLastName());
        }

        return result;
    }
}
