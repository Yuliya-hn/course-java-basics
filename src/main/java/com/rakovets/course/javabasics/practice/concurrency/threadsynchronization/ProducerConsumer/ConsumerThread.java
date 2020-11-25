package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.ProducerConsumer;

import java.util.Random;

public class ConsumerThread  implements Runnable{
    private final Store store;

    public ConsumerThread(Store store) {
        this.store = store;
    }

    public void run() {
        Random random = new Random();
        while (true) {
            try {
                Thread.sleep(random.nextInt(50));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            store.consume();
        }
    }
}
