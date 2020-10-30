package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground;

import java.util.ArrayList;

public class SchoolClass {
   private ArrayList<Student>students;

   public SchoolClass(ArrayList<Student> listStudent) {
     this.students = listStudent;
   }
   public Student getBestStudent(ArrayList<Student> listStudent) {
      ArrayList<Student> copyList = new ArrayList<Student>();
      copyList.addAll(listStudent);
      copyList.sort(new StudentAverageMarkComparator());
      Student bestStudent = copyList.get(copyList.size() - 1);
      return bestStudent;
   }

   public ArrayList<Student> getStudents() {
      return students;
   }
}
