package com.rakovets.course.javabasics.practice.generics;

public class Pair <K,V> {
   private K key;
   private V value;
   public Pair(K l,V j) {
       key = l;
       value = j;
   }
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V h) {
        this.value = h;
    }

    public void setKey(K n) {
        this.key = n;
    }
}
