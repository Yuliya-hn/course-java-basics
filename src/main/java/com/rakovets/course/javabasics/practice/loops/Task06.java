package com.rakovets.course.javabasics.practice.loops;

import java.util.Locale;
import java.util.Scanner;

/**
 * Разработать программу для бухгалтерии:
 * Конвертировать чесловую сумму в сумму бухгалтерском формате, т.е. начиная справа, каждые три позиции отделяются
 * пробелом. Известно:
 *
 * @param amount сумма
 * @author Dmitry Rakovets
 * @version 1.0
 * @return сумма в бухгалтерском формате
 */
public class Task06 {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
        Scanner scanner = new Scanner(System.in);

        // Код необходимый для тестирования, не изменять
        long amount = (args.length != 1 ? scanner.nextLong() : Long.parseLong(args[0]));

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их\ можно изменять)
        // Для проверки решени;я необходимо запустить @Test для данного class (в директории test)
        String amountString = new StringBuilder(String.valueOf(amount)).reverse().toString();
        char[] reverseArray1 = amountString.toCharArray();
        for (int i = reverseArray1.length; i > 0; i--) {
            if (i % 3 == 0) {
                System.out.print(" ");
            }
            System.out.print(reverseArray1[i-1]);
        }
    }
}