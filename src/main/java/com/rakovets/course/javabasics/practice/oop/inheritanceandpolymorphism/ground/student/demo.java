package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.student;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Ben","Smit",20,7.8 ));
        students.add(new Student("Ben", "Grot", 19, 8.2));
        students.add(new Student("Rick", "Joss", 21, 9.0));
        students.add(new Student("Morty", "Hable", 18, 6.5));

        students.sort(new StudentNameAndSurnameComparator());
        System.out.println(students.get(2).getName());

    }
}
