package com.rakovets.course.javabasics.practice.masterWorker;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    Queue<Integer> queueNumbers = new LinkedList<>();
    Boolean isFinished = false;
}
