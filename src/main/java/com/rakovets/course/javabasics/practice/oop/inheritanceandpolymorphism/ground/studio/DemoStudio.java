package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.studio;

import java.util.ArrayList;
import java.util.List;

public class DemoStudio {

    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<Actor>();

        actors.add(new Actor("ABC", "ABC", 2.5, 22));
        actors.add(new Actor("BCD", "BBC", 5.2, 23));
        actors.add(new Actor("AAC", "AAC", 9.5, 21));
        actors.add(new Actor("BBC", "BBC", 1.0, 22));

        System.out.println(actors.toString());

        actors.sort(new ActorLastNameComparator());

        System.out.println("After sort - ActorLastNameComparator: " + actors.toString());

        actors.sort(new ActorFeeComparator());

        System.out.println("After sort - ActorFeeComparator: " + actors.toString());

        actors.sort(new ActorAgeComparator());

        System.out.println("After sort - ActorAgeComparator: " + actors.toString());

        actors.sort(new ActorLastNameAndAgeComparator());

        System.out.println("After sort - ActorLastNameAndAgeComparator: " + actors.toString());

        actors.sort(new ActorFeeAndLastNameComparator());

        System.out.println("After sort - ActorFeeAndLastNameComparator: " + actors.toString());


        Studio studio = new Studio(actors);

        studio.fire();

        System.out.println("After sort - ActorFeeAndLastNameComparator: " + actors.toString());

    }
}
