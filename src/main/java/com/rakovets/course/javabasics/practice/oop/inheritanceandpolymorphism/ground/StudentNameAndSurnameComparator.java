package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.studio.Actor;

import java.util.Comparator;

public class StudentNameAndSurnameComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        int result = student1.getName().compareTo(student2.getSurname());

        if (result == 0) {
            result = student1.getSurname().compareTo(student2.getSurname());
        }
        return result;
    }
}
