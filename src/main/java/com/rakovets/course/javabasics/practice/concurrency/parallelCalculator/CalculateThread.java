package com.rakovets.course.javabasics.practice.concurrency.parallelCalculator;

import java.util.ArrayList;

public class CalculateThread extends Thread {
    ArrayList<Integer[]> deltaArrays;
    int indexOfThread;

    public CalculateThread(ArrayList<Integer[]> deltaArrays,int indexOfThread){
        this.deltaArrays = deltaArrays;
        this.indexOfThread = indexOfThread;
    }
    @Override
    public void run() {
        System.out.printf("The Thread #%s has been STARTED with %s count of arrays \n", indexOfThread, deltaArrays.size());
        new ParallelCalculator().getMaxFromArrays(deltaArrays);
        System.out.printf("The Thread #%s has been FINISHED \n", indexOfThread);
    }
}
