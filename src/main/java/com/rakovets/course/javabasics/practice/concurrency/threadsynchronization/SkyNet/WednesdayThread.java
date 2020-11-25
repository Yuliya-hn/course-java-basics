package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.SkyNet;

import java.util.ArrayList;

public class WednesdayThread implements Runnable{
    private final Factory factory;
    private final Time time;
    ArrayList<Details> listOfDetailsOfWednesday = new ArrayList<>();

    public WednesdayThread(Factory factory, Time time) {
        this.factory = factory;
        this.time = time;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++){

        }

    }
}
