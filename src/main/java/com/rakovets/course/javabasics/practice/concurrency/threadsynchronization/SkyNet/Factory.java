package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.SkyNet;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

import java.util.*;

public class Factory {
    LinkedList<Detail> listOfDetails = new LinkedList<>();
    ArrayList<String> typeOfDetails = new ArrayList<>(Arrays.asList("Head", "Torso", "Hand", "Foot"));

    public Factory() { }

    public synchronized void createdDetails() {
        Random number = new Random();
        for (int i = 0; i < 10 ; i++){
            String createdDetailType = this.typeOfDetails.get(number.nextInt(4));
            this.listOfDetails.add(new Detail(createdDetailType)) ;
        }
        StandardOutputUtil.printlnWithTimeAndThread("Factory creates product with type " + listOfDetails.size(), AnsiColorCode.FG_GREEN_BOLD);
    }

    public synchronized Detail getDetails() {
        return this.listOfDetails.removeFirst();
    }

    public int getCountOfRobots(ArrayList<Detail> listOfDetails) {
        Map<String, Integer> countMap = new HashMap<>();

        for (String type: typeOfDetails) {
            countMap.put(type, 0);
        }

        for (Detail detail: listOfDetails) {
            Integer currentCount = countMap.get(detail.type) + 1;
            countMap.put(detail.type, currentCount);
        }
        int countOfPairHands  = (int) Math.floor(countMap.get("Hand") / 2);
        countMap.put("Hand", countOfPairHands);
        int countOfPairFoot  = (int) Math.floor(countMap.get("Foot") / 2);
        countMap.put("Foot", countOfPairFoot);
        int minOfDetails = Integer.MAX_VALUE;
        for (Integer count: countMap.values()) {
            if (minOfDetails > count) {
                minOfDetails = count;
            }
        }

        return minOfDetails;
    }

}
