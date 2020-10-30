package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.studio.Actor;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.studio.ActorLastNameComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    @Test
    void testStudentSortedByAge() {
        Student student = new Student("Tom","Smit",20,7.8 );

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("Tim", "Grot", 19, 8.2));
        students.add(new Student("Rick", "Joss", 21, 9.0));
        students.add(new Student("Morty", "Hable", 18, 6.5));


        Assertions.assertEquals("ABC", students.get(0).getSurname(), "Original Order");

        students.sort(new StudentAgeComparator());

        Assertions.assertEquals("ABC", students.get(0).getSurname(), "StudentAgeComparator Order - First element");
        Assertions.assertEquals("ZXC", students.get(students.size() - 1).getSurname(), "StudentAgeComparator Order - Last element");
    }

    @Test
    void testStudentSortedByAverageMark() {
        Student student = new Student("Tom","Smit",20,7.8 );

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("Tim", "Grot", 19, 8.2));
        students.add(new Student("Rick", "Joss", 21, 9.0));
        students.add(new Student("Morty", "Hable", 18, 6.5));

        students.sort(new StudentAverageMarkComparator());

        Assertions.assertEquals("ABC", students.get(0).getAverageAnnualMark(), "StudentAverageMarkComparator Order - First element");
        Assertions.assertEquals("ZXC", students.get(students.size() - 1).getAverageAnnualMark(), "StudentAverageMarkComparator Order - Last element");
    }

    @Test
    void testStudentSortedByNameAndSurname() {
        Student student = new Student("Tom","Smit",20,7.8 );

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("Tim", "Grot", 19, 8.2));
        students.add(new Student("Rick", "Joss", 21, 9.0));
        students.add(new Student("Morty", "Hable", 18, 6.5));

        students.sort(new StudentNameAndSurnameComparator());

       // Assertions.assertEquals("ABC", students.StudentNameAndSurnameComparator(), "StudentAverageMarkComparator Order - First element");
        //Assertions.assertEquals("ZXC", students.StudentNameAndSurnameComparator(), "StudentAverageMarkComparator Order - Last element");
    }

}
