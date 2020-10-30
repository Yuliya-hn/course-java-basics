package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.studio.Actor;

import java.util.Comparator;
public class StudentAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getAge(), student2.getAge());
    }
}
