package ProhorenokBook.Collections.Set_usage.HashSet_usage;

import java.util.*;

/**
 * Указать начальную емкость множества и коэфициент заполнения - вещественное число от 0.0 до 1.0
 * МНОЖЕСТВО УНИКАЛЬНЫХ ЗНАЧЕНИЙ!!!!!
 */
public class Test1 {
    public static void main(String[] args) {
    /*
    Создание объекта
     */
        Set<Integer> set0 = new HashSet<>();
        System.out.println(set0.size());
        set0.add(10);
        set0.add(59);
        System.out.println(set0.toString()); // [10, 59]

       Set<Integer> set1 = new HashSet<>(16,0.75f);
        Collections.addAll(set1,1,2,2,2,2,3,4,4,4,5,6,6,6,7,8,9);
        System.out.println(set1.toString()); // [1, 2, 3, 4, 5, 6, 7, 8, 9]

        /*
        Создание пустого неизменяемого множества
         */
        Set<Integer> set2 = Set.<Integer>of();
        System.out.println(set2.size()); //0

        /*
        Создание неизменяемого фикс множества
         */
        Set<Integer> set3 = Set.of(1,2,3,4,5);
        System.out.println(set3.toString()); // [1, 2, 3, 4, 5] Важно! числа беспорядочно будут появляться, главное уникальны

        /*
       Вставка элемента в множество
         */
        Set<Integer> set4 = new HashSet<>();
        System.out.println(set4.add(1)); // true
        System.out.println(set4.add(2)); // true
        System.out.println(set4.add(1)); // false
        System.out.println(set4.add(1)); // false
        System.out.println(set4.add(3)); // true
        set4.add(8);
        System.out.println(set4.toString()); // [1, 2, 3, 8]

        /*
        Вставка элемента из другой коллекции
         */
        List<Integer> set5 = new ArrayList<>();
        Collections.addAll(set5,1,2,4,5,11,5,5,4,3,6,6,6,7,7,8,8,8,9,9,9,10);
        Set<Integer> set6 = new HashSet<>();
        set6.addAll(set5);
        System.out.println(set6.toString()); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]

    }
}
