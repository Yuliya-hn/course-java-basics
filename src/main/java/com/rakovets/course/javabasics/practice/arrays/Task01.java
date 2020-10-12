package com.rakovets.course.javabasics.practice.arrays;

import com.rakovets.course.javabasics.util.StandardInputTask;

/**
 * Разработать программу для электронного дневника:
 * которая работает с отметками только по одному предмету
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task01 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        int countMarks = INPUT_SCANNER.nextInt();
        int[] marks = nextArray(countMarks);

        // Вызов методов

        System.out.println(getMinMark(marks));
        System.out.println(getMaxMark(marks));
        System.out.println(getAverageMark(marks));
    }

    /**
     * Возвращает средне арифметическую отметку с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double getAverageMark(int[] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        double sumAverageMark = 0.0;
        for (int i = 0; i < marks.length; i++){
            sumAverageMark += marks[i];
        }
        double averageMark = sumAverageMark / marks.length;
        double roundOffAverageMark = Math.round(averageMark * 100.0) / 100.0;
        return roundOffAverageMark;
    }

    /**
     * Возвращает минимальную отметку.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int getMinMark(int[] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int minMark = marks[0];
        for (int number : marks ) {
            if (number < minMark) {
                minMark = number;
            }
        }
        return minMark;
    }

    /**
     * Возвращает максимальну отметку.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int getMaxMark(int[] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int maxMark = marks[0];
        for (int number : marks ) {
            if (number > maxMark) {
                maxMark = number;
            }
        }
        return maxMark;
    }

    private static int[] nextArray(int countMarks) {
        int[] marks = new int[countMarks];
        for (int i = 0; i < countMarks; i++) {
            marks[i] = INPUT_SCANNER.nextInt();
        }
        return marks;
    }
}