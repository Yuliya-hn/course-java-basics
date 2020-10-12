package com.rakovets.course.javabasics.practice.arrays;

import com.rakovets.course.javabasics.util.StandardInputTask;

/**
 * Разработать программу для электронного дневника:
 * которая работает с отметками по всем предметам.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task02 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        int countDisciplines = INPUT_SCANNER.nextInt();
        int countSemesters = INPUT_SCANNER.nextInt();
        int[][] marks = nextArray(countDisciplines, countSemesters);

        // Вызов методов
        System.out.println(getAverageMark(marks));
        System.out.println(getMinMark(marks));
        getMaxMark(marks);
    }

    /**
     * Возвращает средне арифметическую отметку за весь период обучения с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double getAverageMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        double sumAverageMark = 0.0;
        int count = 0;
        for (int i = 0; i < marks.length; i++){
            for (int j = 0; j < marks[i].length; j++){
               sumAverageMark += marks[i][j];
               count++;
            }
        }
        double averageMark = sumAverageMark / count;
        double roundOffAverageMark = Math.round(averageMark * 100.0) / 100.0;
        return roundOffAverageMark;
    }

    /**
     * Возвращает минимальную отметку за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int getMinMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int minMark = marks[0][0];
        for (int i = 0; i < marks.length; i++ ) {
            for (int j = 0; j < marks[i].length; j++){
                if (marks[i][j] < minMark) {
                    minMark = marks[i][j];
                }
            }
        }
        return minMark;
    }

    /**
     * Возвращает максимальну отметку за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int getMaxMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int maxMark = marks[0][0];
        for (int i = 0; i < marks.length; i++ ) {
            for (int j = 0; j < marks[i].length; j++){
                if (marks[i][j] > maxMark) {
                    maxMark = marks[i][j];
                }
            }
        }
        return maxMark;
    }

    private static int[][] nextArray(int countDisciplines, int countSemesters) {
        int[][] marks = new int[countDisciplines][countSemesters];
        for (int i = 0; i < countDisciplines; i++) {
            for (int j = 0; j < countSemesters; j++) {
                marks[i][j] = INPUT_SCANNER.nextInt();
            }
        }
        return marks;
    }
}