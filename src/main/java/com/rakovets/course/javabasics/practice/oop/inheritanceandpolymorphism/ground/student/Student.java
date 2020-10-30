package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.student;

public class Student {
    private String name;
    private String surname;
    private Integer age;
    private Double averageAnnualMark;

    public Student (String name,String surname,Integer age,Double averageAnnualMark) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.averageAnnualMark = averageAnnualMark;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getAverageAnnualMark() {
        return averageAnnualMark;
    }
}
