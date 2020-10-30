package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.studio.Actor;

import java.util.Comparator;

public class StudentAverageMarkComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student1.getAverageAnnualMark(), student2.getAverageAnnualMark());
    }
}
