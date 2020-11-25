package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.SkyNet;

import java.util.ArrayList;

public class WorldThread implements Runnable{
    private final Factory factory ;
    private final Time time ;
    ArrayList<Details> listOfDetailsOfWorldThread = new ArrayList<>();

    public WorldThread(Factory factory, Time time) {
        this.factory = factory;
        this.time = time;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++){
            Details detail = factory.listOfDetails.removeFirst();
            listOfDetailsOfWorldThread.add(detail);
        }
    }
}
