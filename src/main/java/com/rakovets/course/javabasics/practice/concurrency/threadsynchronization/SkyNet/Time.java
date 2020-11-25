package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.SkyNet;

public class Time {
    Boolean isNightNow = false;
    int remainDays = 100;

    public synchronized void changeTime() {
        if (this.isNightNow == false) {
            this.isNightNow = true;
            System.out.println("Now is Night");
            this.remainDays--;
            System.out.println(this.remainDays + " days are remain before battle");
        } else {
            this.isNightNow = false;
            System.out.println("Now is day");
        }
        notifyAll();
    }

    public synchronized Boolean isNightNow() {
        return this.isNightNow;
    }

    public synchronized int getRemainDays() {
        return this.remainDays;
    }
}

