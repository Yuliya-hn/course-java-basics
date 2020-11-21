package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MasterWorker {
    public static void main(String[] args)  {
        Scanner enter = new Scanner(System.in);
        int number = 0;
        while (true) {
            System.out.print("Please enter the number \n");
            try {
                number = enter.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Not allowed symbols");
                break;
            }
            if (number == -1 ) {
                break;
            }
        }
    }
}
