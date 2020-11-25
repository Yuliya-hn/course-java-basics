package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.SkyNet;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Factory {
    LinkedList<Details> listOfDetails = new LinkedList<>();
    ArrayList<String> typeOfDetails = new ArrayList<>(Arrays.asList("Head", "Torso", "Hand","Foot"));

    public Factory() {
    }

    public synchronized void createdDetails() {
        Random number = new Random();
        for (int i = 0; i < 10 ; i++){
            String createdDetailType = typeOfDetails.get(number.nextInt(4));
            listOfDetails.add(new Details(createdDetailType)) ;
            StandardOutputUtil.printlnWithTimeAndThread("Factory creates product with type " + createdDetailType, AnsiColorCode.FG_GREEN_BOLD);
        }
    }

    public synchronized Details getDetails(){
       return listOfDetails.removeFirst();
    }

}
