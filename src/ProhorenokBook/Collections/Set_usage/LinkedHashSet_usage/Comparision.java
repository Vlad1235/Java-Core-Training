package ProhorenokBook.Collections.Set_usage.LinkedHashSet_usage;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Класс LinkedHashSet<E> наследует класс HashSet<E>  и не добавляет никаких новых методов - различие только во внутренней реализации
 * хранения элементов: класс HashSet<E> не гарантирует никакого порядка получения элементов, а
 * класс LinkedHashSet<E> - запоминает порядок вставки элементов.
 */
public class Comparision {
    public static void main(String[] args) {
        Set<Integer> set0 = new LinkedHashSet<>();
        Collections.addAll(set0,1,2,3);
        set0.add(8);
        set0.add(0);
        set0.add(4);
        for (Integer item: set0){
            System.out.print(item + " "); // 1 2 3 8 0 4  Важно! Запоминает порядок вставки элементов
        }

        Set<Integer> set1 = new HashSet<>();
        Collections.addAll(set1,1,2,3);
        set1.add(8);
        set1.add(0);
        set1.add(4);
        for (Integer item: set1){
            System.out.print(item + "\t"); // 0	1	2	3	4	8  Важно! нет порядка в предствлении!
        }

    }
}
