package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.studio;

import java.util.List;

public class Studio {

    private List<Actor> actors;

    public Studio(List<Actor> actors) {
        this.actors = actors;
    }

    public void fire() {
        this.fire(this.actors);
    }

    public void fire(List<Actor> actors) {

        Actor actorWithMaxFee = actors.get(0);

        for (Actor actor: actors) {
            if(actor.getFee() > actorWithMaxFee.getFee()) {
                actorWithMaxFee = actor;
            }
        }

        actors.remove(actorWithMaxFee);
    }


    public List<Actor> getActors() {
        return actors;
    }

}
