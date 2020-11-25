package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.SkyNet;

public class TimeThread implements Runnable{
   private final Time time;

    public TimeThread(Time time) {
        this.time = time;
    }

    @Override
    public void run() {
        while (this.time.remainDays > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.time.changeTime();
        }
    }
}
