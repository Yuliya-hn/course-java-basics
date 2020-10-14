package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class RectangleTest {
    public static void main(String[] args) {

        Point topLeftPoint = new Point(1, 4);
        Point bottomRightPoint = new Point(5, 2);

        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);

        System.out.println("BottomRightPoint X position: " + rectangle.getBottomRightPoint().getX());
        System.out.println("BottomRightPoint Y position: " + rectangle.getBottomRightPoint().getY());
        System.out.println("topLeftPoint X position: " + rectangle.getTopLeftPoint().getX());
        System.out.println("topLeftPoint Y position: " + rectangle.getTopLeftPoint().getY());

        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());
        System.out.println("area of a rectangle: " + rectangle.getArea());

        rectangle.setBottomRightPoint(new Point(5,6));
        rectangle.setTopLeftPoint(new Point(2,9));

        System.out.println("BottomRightPoint X position: " + rectangle.getBottomRightPoint().getX());
        System.out.println("BottomRightPoint Y position: " + rectangle.getBottomRightPoint().getY());
        System.out.println("topLeftPoint X position: " + rectangle.getTopLeftPoint().getX());
        System.out.println("topLeftPoint Y position: " + rectangle.getTopLeftPoint().getY());

        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());
        System.out.println("area of a rectangle: " + rectangle.getArea());


    }
}


