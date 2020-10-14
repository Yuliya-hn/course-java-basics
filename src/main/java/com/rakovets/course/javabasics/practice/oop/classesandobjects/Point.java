package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point otherPoint) {
        //formula = sqrt((y2 - y1) **  (y2 - y1) + (x2 - x1) **  (x2 - x1))
        double distance =  Math.sqrt((otherPoint.y - this.y) * (otherPoint.y - this.y) + (otherPoint.x - this.x) * (otherPoint.x - this.x));
        return distance;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
