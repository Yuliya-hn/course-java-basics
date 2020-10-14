package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class PointTest {
    public static void main(String[] args){
        Point pointK = new Point(3,6);
        Point pointJ = new Point(8,4);
        System.out.println("K of i point is equal " + pointK.getX());
        System.out.println("Y of i point is equal " + pointK.getY());
        System.out.println("distance between K and j: " + pointK.distance(pointJ));
        pointK.setX(6);
        System.out.println("K of i point after set: " + pointK.getX());
        pointK.setY(9);
        System.out.println("Y of i point after set: " + pointK.getY());
        System.out.println("distance between K and j: " + pointK.distance(pointJ));
    }
}
