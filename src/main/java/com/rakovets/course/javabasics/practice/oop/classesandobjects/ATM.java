package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class ATM {

    private int numberBanknotes100;
    private int numberBanknotes50;
    private int numberBanknotes20;

    public ATM(int numberBanknotes100, int numberBanknotes50, int numberBanknotes20) {
        this.numberBanknotes100 = numberBanknotes100;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes20 = numberBanknotes20;
    }

    public void addBanknotes100(int countBanknotes) {
        this.numberBanknotes100 += countBanknotes;
    }

    public void addBanknotes50(int countBanknotes) {
        this.numberBanknotes50 += countBanknotes;
    }

    public void addBanknotes20(int countBanknotes) {
        this.numberBanknotes20 += countBanknotes;
    }

    private int getTotalAmountInATM() {
        return this.numberBanknotes100 * 100 + this.numberBanknotes50 * 50 + this.numberBanknotes20 * 20;
    }

    public boolean isPossibleIssue(int amount) {
        return this.getTotalAmountInATM() >= amount;
    }

}
