package tasks;

import java.util.HashMap;
import java.util.Map;

// O(n) время, O(n) память.
// Массив содержит уникальные числа, решение всегда есть.
public final class TwoSum {

    private TwoSum() {
    }

    public static int[] findInSorted(int[] nums, int target) {
        // HashMap: значение -> его индекс. Ключ — число, значение — позиция.
        Map<Integer, Integer> seen = new HashMap<>(nums.length * 2);
        // Один проход по массиву — быстрее O(n) нельзя.
        for (int i = 0; i < nums.length; i++) {
            // Какое число нужно в пару к текущему nums[i].
            int need = target - nums[i];
            // Ищем это число среди уже встреченных в коллекции.
            Integer j = seen.get(need);
            // Если нашли — пара существует, возвращаем оба индекса.
            if (j != null) {
                return new int[]{j, i};
            }
            // Иначе кладём текущее число и его индекс в коллекцию.
            seen.put(nums[i], i);
        }
        // По условию решение всегда есть; сюда не дойдём.
        throw new IllegalArgumentException("No two sum solution");
    }
}