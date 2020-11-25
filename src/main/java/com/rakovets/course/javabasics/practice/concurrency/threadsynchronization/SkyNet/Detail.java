package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.SkyNet;

public class Detail {
    String type;

    public Detail(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return "{" + this.type + "}";
    }
}
