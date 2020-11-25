package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.ProducerConsumer;

import java.util.Random;

public class ProducerThread implements Runnable {
    private Store store;
    public ProducerThread(Store store) {
        this.store = store;
    }
    public void run() {
        Random random = new Random();
        while (true) {
            store.produce();
        }
    }
}
