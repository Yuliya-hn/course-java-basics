package com.rakovets.course.javabasics.practice.jcf.list;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.student.Student;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.student.StudentAgeComparator;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.student.StudentAverageMarkComparator;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.student.StudentNameAndSurnameComparator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

public class StudentTest {
    @Test
    void testStudentSortedByAge() {
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("Tim", "Joss", 19, 8.2));
        students.add(new Student("Rick", "Grot", 21, 9.0));
        students.add(new Student("Morty", "Hable", 18, 6.5));

        Assertions.assertEquals("Joss", students.get(0).getSurname(), "Original Order");

        students.sort(new StudentAgeComparator());

        Assertions.assertEquals("Hable", students.get(0).getSurname(), "StudentAgeComparator Order - First element");
    }

    @Test
    void testStudentSortedByAverageMark() {
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("Tom","Smit",20,7.8 ));
        students.add(new Student("Tim", "Grot", 19, 8.2));
        students.add(new Student("Rick", "Joss", 21, 9.0));
        students.add(new Student("Morty", "Hable", 18, 6.5));

        students.sort(new StudentAverageMarkComparator());

        Assertions.assertEquals("Hable", students.get(0).getSurname(), "StudentAverageMarkComparator Order - First element");
        Assertions.assertEquals(6.5, students.get(0).getAverageAnnualMark());

        Assertions.assertEquals("Joss", students.get(students.size() - 1).getSurname(), "StudentAverageMarkComparator Order - Last element");
        Assertions.assertEquals(9.0, students.get(students.size() - 1).getAverageAnnualMark());

    }

    @Test
    void testStudentSortedByNameAndSurname() {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Ben","Smit",20,7.8 ));
        students.add(new Student("Ben", "Grot", 19, 8.2));
        students.add(new Student("Rick", "Joss", 21, 9.0));
        students.add(new Student("Morty", "Hable", 18, 6.5));

        students.sort(new StudentNameAndSurnameComparator());

        Assertions.assertEquals("Grot", students.get(0).getSurname());
        Assertions.assertEquals("Smit", students.get(1).getSurname());
    }

}
