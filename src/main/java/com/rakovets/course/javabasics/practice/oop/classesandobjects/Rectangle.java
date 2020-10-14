package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Rectangle {

    private Point topLeftPoint;
    private Point bottomRightPoint;

    private Point topRightPoint;
    private Point bottomLeftPoint;

    public Rectangle(Point topLeftPoint, Point bottomRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.bottomRightPoint = bottomRightPoint;

        this.bottomLeftPoint = new Point(this.topLeftPoint.getX(), this.bottomRightPoint.getY());
        this.topRightPoint = new Point(this.bottomRightPoint.getX(), this.topLeftPoint.getY());
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.bottomLeftPoint.setX(topLeftPoint.getX());
        this.topRightPoint.setY(topLeftPoint.getY());

        this.topLeftPoint = topLeftPoint;
    }

    public void setBottomRightPoint(Point bottomRightPoint) {
        this.bottomLeftPoint.setY(bottomRightPoint.getY());
        this.topRightPoint.setX(bottomRightPoint.getX());

        this.bottomRightPoint = bottomRightPoint;
    }

    public Point getTopLeftPoint() {
        return this.topLeftPoint;
    }

    public Point getBottomRightPoint() {
        return this.bottomRightPoint;
    }

    public double getPerimeter() {
        return (2 * this.topLeftPoint.distance(this.topRightPoint)) + (2 * this.topLeftPoint.distance(this.bottomLeftPoint));
    }

    public double getArea() {
        return this.topLeftPoint.distance(this.topRightPoint) * this.topLeftPoint.distance(this.bottomLeftPoint);
    }


}
