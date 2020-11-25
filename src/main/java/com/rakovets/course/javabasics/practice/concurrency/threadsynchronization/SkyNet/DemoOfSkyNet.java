package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.SkyNet;

public class DemoOfSkyNet {
    public static void main(String[] args) {
        Time time = new Time();

        Factory factory = new Factory();

        WorldThread world = new WorldThread(factory, time);
        WednesdayThread wednesday = new WednesdayThread(factory, time);

        FactoryThread factoryRun = new FactoryThread(factory, time);

        TimeThread timeRun = new TimeThread(time);

        Thread timeThread = new Thread(timeRun);
        timeThread.setName("Time-Thread");
        timeThread.start();

        Thread factoryThread = new Thread(factoryRun);
        factoryThread.setName("Factory-Thread");
        factoryThread.start();


    }
}
