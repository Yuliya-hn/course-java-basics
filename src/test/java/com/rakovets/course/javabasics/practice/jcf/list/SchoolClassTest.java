package com.rakovets.course.javabasics.practice.jcf.list;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.student.SchoolClass;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class SchoolClassTest {
    @Test
    void testStudentSortedByAge() {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Tom","Smit",20,7.8 ));
        students.add(new Student("Tim", "Joss", 19, 8.2));
        students.add(new Student("Rick", "Grot", 21, 9.0));
        students.add(new Student("Morty", "Hable", 18, 6.5));

        SchoolClass classs = new SchoolClass(students);
        Student bestStudent = classs.getBestStudent(students);
        Assertions.assertEquals("Grot",bestStudent.getSurname());
    }
}
