package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.studio.test;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.studio.*;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;


public class ActorTest {

    @Test
    void testSingleActor() {
        Actor actor = new Actor("ABC", "BCD", 2.5, 22);

        Assertions.assertEquals("ABC", actor.getFirstName());
        Assertions.assertEquals("BCD", actor.getLastName());
        Assertions.assertEquals(2.5, actor.getFee());
        Assertions.assertEquals(22, actor.getAge());
    }

    @Test
    void testActorsWithSortByActorLastNameComparator() {
        Actor actor = new Actor("ABC", "BCD", 2.5, 22);

        List<Actor> actors = new ArrayList<Actor>();

        actors.add(new Actor("ABC", "ABC", 2.5, 22));
        actors.add(new Actor("BCD", "BBC", 5.2, 23));
        actors.add(new Actor("BBC", "ZXC", 2.0, 20));


        Assertions.assertEquals("ABC", actors.get(0).getLastName(), "Original Order");

        actors.sort(new ActorLastNameComparator());

        Assertions.assertEquals("ABC", actors.get(0).getLastName(), "ActorLastNameComparator Order - First element");
        Assertions.assertEquals("ZXC", actors.get(actors.size() - 1).getLastName(), "ActorLastNameComparator Order - Last element");
    }

    @Test
    void testActorsWithSortByActorFeeComparator() {
        Actor actor = new Actor("ABC", "BCD", 2.5, 22);

        List<Actor> actors = new ArrayList<Actor>();

        actors.add(new Actor("ABC", "ABC", 2.5, 22));
        actors.add(new Actor("BCD", "BBC", 5.2, 23));
        actors.add(new Actor("AAC", "AAC", 9.5, 21));
        actors.add(new Actor("BBC", "BBC", 1.0, 22));
        actors.add(new Actor("BBC", "ZXC", 2.0, 20));


        Assertions.assertEquals("ABC", actors.get(0).getLastName(), "Original Order");

        actors.sort(new ActorFeeComparator());

        Assertions.assertEquals(1.0, actors.get(0).getFee(), "ActorFeeComparator Order - First element");
        Assertions.assertEquals(9.5, actors.get(actors.size() - 1).getFee(), "ActorFeeComparator Order - Last element");
    }

    @Test
    void testActorsWithSortByActorAgeComparator() {
        Actor actor = new Actor("ABC", "BCD", 2.5, 22);

        List<Actor> actors = new ArrayList<Actor>();

        actors.add(new Actor("ABC", "ABC", 2.5, 22));
        actors.add(new Actor("BCD", "BBC", 5.2, 23));
        actors.add(new Actor("AAC", "AAC", 9.5, 21));
        actors.add(new Actor("BBC", "BBC", 1.0, 22));
        actors.add(new Actor("BBC", "ZXC", 2.0, 20));


        Assertions.assertEquals("ABC", actors.get(0).getLastName(), "Original Order");

        actors.sort(new ActorAgeComparator());

        Assertions.assertEquals(20, actors.get(0).getAge(), "ActorAgeComparator Order - First element");
        Assertions.assertEquals(23, actors.get(actors.size() - 1).getAge(), "ActorAgeComparator Order - Last element");
    }

    @Test
    void testActorsWithSortByActorLastNameAndAgeComparator() {
        Actor actor = new Actor("ABC", "BCD", 2.5, 22);

        List<Actor> actors = new ArrayList<Actor>();

        actors.add(new Actor("ABC", "ABC", 2.5, 22));
        actors.add(new Actor("BCD", "AAC", 5.2, 23));
        actors.add(new Actor("AAC", "AAC", 9.5, 21));
        actors.add(new Actor("BBC", "ZXC", 1.0, 22));
        actors.add(new Actor("BBC", "ZXC", 2.0, 20));


        Assertions.assertEquals("ABC", actors.get(0).getLastName(), "Original Order");

        actors.sort(new ActorLastNameAndAgeComparator());

        Assertions.assertEquals("AAC", actors.get(0).getLastName(), "ActorLastNameAndAgeComparator Order - First element");
        Assertions.assertEquals(21, actors.get(0).getAge(), "ActorLastNameAndAgeComparator Order - First element");
        Assertions.assertEquals("ZXC", actors.get(actors.size() - 1).getLastName(), "ActorLastNameAndAgeComparator Order - Last element");
        Assertions.assertEquals(22, actors.get(actors.size() - 1).getAge(), "ActorLastNameAndAgeComparator Order - Last element");
    }

    @Test
    void testActorsWithSortByActorFeeAndLastNameComparator() {
        Actor actor = new Actor("ABC", "BCD", 2.5, 22);

        List<Actor> actors = new ArrayList<Actor>();

        actors.add(new Actor("ABC", "ABC", 2.5, 22));
        actors.add(new Actor("BCD", "AAC", 5.2, 23));
        actors.add(new Actor("AAC", "AAC", 9.5, 21));
        actors.add(new Actor("BBC", "ZXC", 1.0, 22));
        actors.add(new Actor("BBC", "DCA", 9.5, 20));


        Assertions.assertEquals("ABC", actors.get(0).getLastName(), "Original Order");

        actors.sort(new ActorFeeAndLastNameComparator());

        Assertions.assertEquals(1.0, actors.get(0).getFee(), "ActorFeeAndLastNameComparator Order - First element");
        Assertions.assertEquals("ZXC", actors.get(0).getLastName(), "ActorFeeAndLastNameComparator Order - First element");
        Assertions.assertEquals(9.5, actors.get(actors.size() - 1).getFee(), "ActorFeeAndLastNameComparator Order - Last element");
        Assertions.assertEquals("DCA", actors.get(actors.size() - 1).getLastName(), "ActorFeeAndLastNameComparator Order - Last element");
    }
}