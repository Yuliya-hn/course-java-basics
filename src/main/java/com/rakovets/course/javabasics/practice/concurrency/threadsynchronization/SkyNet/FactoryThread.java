package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.SkyNet;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

public class FactoryThread implements Runnable {
    private final Time time;
    private final Factory factory;

    public FactoryThread(Factory factory, Time time) {
        this.factory = factory;
        this.time = time;
    }

    @Override
    public void run() {
        synchronized (this.time)  {
            try {
                while (this.time.getRemainDays() > 0) {

                    // wait for start of Day
                    while (this.time.isNightNow() == true) {
                        StandardOutputUtil.printlnWithTimeAndThread("Factory is waiting for start Day", AnsiColorCode.FG_GREEN_BOLD);
                        this.time.wait();
                    }

                    this.factory.createdDetails();

                    // wait for end of Day
                    while (this.time.isNightNow() == false) {
                        StandardOutputUtil.printlnWithTimeAndThread("Factory is waiting for end Day", AnsiColorCode.FG_GREEN_BOLD);
                        this.time.wait();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
