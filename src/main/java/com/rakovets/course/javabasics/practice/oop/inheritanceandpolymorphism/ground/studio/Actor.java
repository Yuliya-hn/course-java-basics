package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground.studio;

public class Actor {
    private String firstName;
    private String lastName;
    private Double fee;
    private Integer age;

    public Actor(String firstName, String lastName, Double fee, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fee = fee;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public Double getFee() {
        return fee;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }


    @Override
    public String toString() {
        String format = "Actor{name = %1$s, age = %2$s, fee = %3$s}";
        return String.format(format, (this.firstName + " " + this.lastName), this.age, this.fee);
    }
}
