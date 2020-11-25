package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet;

import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.SkyNet.Factory;
import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.SkyNet.Time;
import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.SkyNet.WednesdayThread;
import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.SkyNet.WorldThread;
import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.SkyNet.FactoryThread;
import com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.SkyNet.TimeThread;

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

        Thread wednesdayThread = new Thread(wednesday);
        wednesdayThread.setName("wednesday-Thread");
        wednesdayThread.start();

        Thread worldThread = new Thread(world);
        worldThread.setName("world-Thread");
        worldThread.start();

    }
}
