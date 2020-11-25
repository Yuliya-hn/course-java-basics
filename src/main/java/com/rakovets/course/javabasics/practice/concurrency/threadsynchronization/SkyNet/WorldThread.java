package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.SkyNet;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

import java.util.ArrayList;

public class WorldThread implements Runnable{
    private final Factory factory ;
    private final Time time ;
    ArrayList<Detail> listOfDetailOfWorldThread = new ArrayList<>();

    public WorldThread(Factory factory, Time time) {
        this.factory = factory;
        this.time = time;
    }

    @Override
    public void run() {
        synchronized (this.time) {
            try {
                while (this.time.getRemainDays() > 0){
                    //wait for start of Night
                    while (this.time.isNightNow() == false) {
                        this.time.wait();
                    }

                    for (int i = 0; i < 5; i++) {
                        Detail theDetail = this.factory.getDetails();
                        if (theDetail != null) {
                            this.listOfDetailOfWorldThread.add(theDetail);
                        }
                    }
                    StandardOutputUtil.printlnWithTimeAndThread("World has taken the details from Factory " + listOfDetailOfWorldThread.size()+ " details",AnsiColorCode.FG_MAGENTA_BOLD_BRIGHT);

                    //wait for start of Night
                    while (this.time.isNightNow() == true && this.time.getRemainDays() != 0) {
                        this.time.wait();
                    }
                }

                int countOfRobots = factory.getCountOfRobots(this.listOfDetailOfWorldThread);
                StandardOutputUtil.printlnWithTimeAndThread("World created " + countOfRobots + " robots",AnsiColorCode.FG_RED_BOLD);

            } catch (InterruptedException e) {

            }

        }
    }
}
