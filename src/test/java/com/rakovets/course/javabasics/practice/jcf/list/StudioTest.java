package com.rakovets.course.javabasics.practice.jcf.list;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.studio.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class StudioTest {

    @Test
    void testStudioAndFire() {

        List<Actor> actors = new ArrayList<Actor>();

        actors.add(new Actor("ABC", "ABC", 2.5, 22));
        actors.add(new Actor("BCD", "BBC", 5.2, 23));
        actors.add(new Actor("AAC", "AAC", 9.5, 21));
        actors.add(new Actor("BBC", "BBC", 1.0, 22));

        Studio studio = new Studio(actors);

        Assertions.assertEquals(actors.size(), studio.getActors().size());
        Assertions.assertEquals(4, studio.getActors().size());

        studio.fire();

        Assertions.assertEquals(3, studio.getActors().size());
    }

}