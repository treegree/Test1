package tasks;

import java.util.HashSet;
import java.util.Set;

// Задание 2: есть ли в массиве дубликаты.
// O(n) время, O(n) память
public final class DuplicateChecker {

    // Приватный конструктор — утилитарный класс.
    private DuplicateChecker() {
    }

    // Возвращает true, если в массиве есть хотя бы один дубликат.
    public static boolean containsDuplicate(int[] nums) {
        // HashSet уже встреченных чисел — коллекция для проверки уникальности.
        Set<Integer> seen = new HashSet<>(nums.length * 2);
        // Один проход по массиву —  O(n)
        for (int n : nums) {
            // add вернёт false, если число уже было — значит, нашли дубликат
            if (!seen.add(n)) {
                return true;
            }
        }
        // Все числа уникальны.
        return false;
    }
}
