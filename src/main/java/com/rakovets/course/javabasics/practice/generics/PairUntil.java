package com.rakovets.course.javabasics.practice.generics;

public final class PairUntil<K,V> {
    public Pair<V,K> swap(Pair<K,V> pair){
        return new Pair<>(pair.getValue(),pair.getKey());
    }
}
