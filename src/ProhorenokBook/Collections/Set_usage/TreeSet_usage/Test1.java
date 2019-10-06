package ProhorenokBook.Collections.Set_usage.TreeSet_usage;


import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet<E> - набор уникальных элементов, хранимых в ОТСОРТИРОВАННОМ ВИДЕ в соответствии с алгоритмом "красное-черное дерево".
 * Хеш-таблица не испльзуется.
 * Класс TreeSet<E> реализует интерфейс Set<E> поэтому все методы из HashSet<E> будут работать
 */
public class Test1 {
    public static void main(String[] args) {
        Set<Integer> set0 = new TreeSet<>(); // по умолчанию интерфейс Comparable<T>  - сортировка по возрастанию
        Collections.addAll(set0,4,4,8,3,1,3,0);
        System.out.println(set0.toString()); // [0, 1, 3, 4, 8]

       Set<Integer> set1 = new TreeSet<>(Collections.reverseOrder()); // интерфейс Comparator<T> - сортировка по убыванию
       Collections.addAll(set1,4,4,8,3,1,3,0);
        System.out.println(set1.toString()); // [8, 4, 3, 1, 0]

        /*
        некоторые методы из интерфейса SortedSet<E>, NavigationSet<E>
         */
        TreeSet<Integer> set2 = new TreeSet<>(); // Тип указать TreeSet<Integer> иначе интерфейсы SortedSet<E> не работают
        Collections.addAll(set2,4,4,8,3,1,3);
        System.out.println(set2.toString()); // [1, 3, 4, 8]
        System.out.println(set2.first()); // 1 возвращает, НЕ удаляет!!
        System.out.println(set2.last()); // 8 возвращает, НЕ удаляет!!
        System.out.println(set2.toString()); // [1, 3, 4, 8]
        System.out.println(set2.pollFirst()); // 1 возвращает, удаляет!!
        System.out.println(set2.pollLast()); // 8 возвращает,  удаляет!!
        System.out.println(set2.toString()); // [3, 4]
    }
}
