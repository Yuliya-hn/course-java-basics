package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

import java.util.ArrayList;
import java.util.Random;

public class ParallelCalculator {

    public ArrayList<Integer> getMaxFromArrays(ArrayList<Integer[]> arrays) {
        ArrayList<Integer> maxInArrays = new ArrayList<>();
        Integer maxValue = Integer.MIN_VALUE;
        for (int j = 0; j < arrays.size(); j++) {
            Integer[] array = arrays.get(j);
            for (int i = 0; i < array.length; i++){
               if (maxValue < array[i]){
                   maxValue = array[i];
               }
            }
            maxInArrays.add(maxValue);
        }
        return maxInArrays;
    }

    public ArrayList<Integer[]> generateListOfArrays(int arraysCount) {
        ArrayList<Integer[]> returnedListOfArrays = new ArrayList<>();

        for(int i = 0; i < arraysCount; i++) {
            returnedListOfArrays.add(this.generateArray());
        }
        return returnedListOfArrays;
    }

    public Integer[] generateArray() {

        Integer randLength = new Random().nextInt(10000);
        Integer[] generatedArray = new Integer[randLength];

        this.fillArrayWithRandom(generatedArray);

        return generatedArray;
    }

    public void fillArrayWithRandom(Integer[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(300);
        }
    }
    public void runInParallel (int countOfThread, ArrayList<Integer[]> arrays) throws InterruptedException {
        StandardOutputUtil.printlnWithTime(">>>>>>>>> Method runInParallel(" + countOfThread + ") is started");
        int countArraysInEachThread = (int) (arrays.size() % countOfThread != 0
                ? Math.floor(arrays.size() / countOfThread) + 1
                : arrays.size() / countOfThread);
        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < countOfThread; i++) {
            int indexOfThread = i;
            int start = i * countArraysInEachThread;
            int nextIndex = (i+1) * countArraysInEachThread;
            int end = nextIndex > arrays.size() ? arrays.size() : nextIndex;
            ArrayList<Integer[]> deltaArrays = new ArrayList<> (arrays.subList(start, end));
            System.out.printf("The Thread #%s is initializing \n", indexOfThread);
            Thread thread = new CalculateThread(deltaArrays,indexOfThread);
            threads.add(thread);
            thread.start();
        }
        for (Thread thread: threads) {
            thread.join();
        }
        StandardOutputUtil.printlnWithTime(">>>>>>>>> Method runInParallel(" + countOfThread + ") is finished", AnsiColorCode.FG_BLUE_BOLD);
    }
}
