package ProhorenokBook.Collections.Set_usage;

import java.nio.charset.IllegalCharsetNameException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Множество - это набор уникальных элементов, с которым можно сравнивать другие элементы, чтобы определить принадлежат ли они этому множеству
 * Реализуют интерфейс Collections<E> и Iterable<T>
 * Для поиска элементов используется хеш-таблица.Значения этой таблицы состоят из целых чисел(типа int) ктр можно получить
 * путем вызова метода hashCode() из класса Object.
 * В качестве исходных данных для формирования  хещ-кода используется адрес объекта
 * в памяти компьютера. Поэтому объекты одного класса с одинаковыми значениями полей получат разные хеш-коды.
 * Если НУЖНО ИЗБЕЖАТЬ этого, то необходимо ВНУТРИ ВАШЕГО КЛАССА переопределить методы equals() и hashCode().
 *
 * Интерфейс Set<E> реализует классы:
 * 1. HashSet<E> - множество, в котором уникальные элементы расположены в произвольном порядке
 * 2. LinkedHashSet<E> - множество, в котором запоминается порядок вставки элементов
 * 3. TreeSet<E> - набор уникальных элементов, хранимых в ОТСОРТИРОВАННОМ ВИДЕ в соответствии с алгоритмом "красное-черное дерево". Хеш-таблица не испльзуется.
      */
public class Description {
    public static void main(String[] args) {
        /*
        Основные операции над множествами:
        1. Обьединение множеств addAll()
        2. Разница множеств removeAll()
        3. Пересечение множеств retainAll()
         */

        /*
        Обьединение множеств
         */
        Set<Integer> set1 = new HashSet<Integer>();
        Collections.addAll(set1,1,2,3);
        Set<Integer> set2 = new HashSet<>();
        Collections.addAll(set2,3,4,5);
        Set<Integer> set3 = new HashSet<>(set1);
        set3.addAll(set2);
        System.out.println(set3.toString()); //[1, 2, 3, 4, 5]


        /*
        Разница множеств
         */
        Set<Integer> set4 = new HashSet<>();
        Collections.addAll(set4,1,2,3);
        Set<Integer> set5 = new HashSet<>();
        Collections.addAll(set5,1,2,4);
        Set<Integer> set6 = new HashSet<>(set4);
        set6.removeAll(set5);
        System.out.println(set6.toString()); // [3]

        /*
        пересечение множеств
         */
        Set<Integer> set7 = new HashSet<>();
        Collections.addAll(set7,1,2,3);
        Set<Integer> set8 = new HashSet<>();
        Collections.addAll(set8,1,2,4);
        Set<Integer> set9 = new HashSet<>(set7);
        set9.retainAll(set8);
        System.out.println(set9.toString()); // [1, 2]

    }
}
