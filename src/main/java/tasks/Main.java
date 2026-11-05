package tasks;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Задание 1 — HashMap, возвращает индексы пары.
        System.out.println(Arrays.toString(TwoSum.findInSorted(new int[]{3, 8, 15, 17}, 23))); // [1, 2]
        // Задание 2 — есть дубликат.
        System.out.println(DuplicateChecker.containsDuplicate(new int[]{4, 5, 6, 6, 8}));      // true
        // Задание 2 — дубликатов нет.
        System.out.println(DuplicateChecker.containsDuplicate(new int[]{4, 5, 6, 7, 8}));      // false
    }
}