package ProhorenokBook.Collections.Set_usage.LinkedHashSet_usage;

import java.util.*;

/**
 *         Реализует множество, в котором запоминается порядок вставки элементов.
 *         Добавить во множество можно ТОЛЬКО уникальные элементы
 */
public class Test1 {
    public static void main(String[] args) {
        Set<Integer> set0 = new LinkedHashSet<>();
        System.out.println(set0.size()); // 0
        set0.add(10);
        set0.add(33);
        System.out.println(set0.toString()); // [10, 33]

        List<Integer> list0 = new ArrayList<>();
        Collections.addAll(list0,1,2,2,2,4,3,4,5,6,6,6,7,8,9);
        Set<Integer> set1 = new LinkedHashSet<>(list0);
        System.out.println(set1.toString()); // [1, 2, 4, 3, 5, 6, 7, 8, 9]

    }
}
