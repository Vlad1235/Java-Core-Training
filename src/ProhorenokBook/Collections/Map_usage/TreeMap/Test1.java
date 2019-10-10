package ProhorenokBook.Collections.Map_usage.TreeMap;

import java.util.Collections;
import java.util.TreeMap;

/**
 * TreeMap - словарь, КЛЮЧИ хранятся в ОТСОРТИТОВАННОМ порядке в соответствии с алгоритмом "красное-черное дерево".
 * Не используется Хеш-таблица
 * Класс реализует интерфейс Map<K,V>  и интерфейс SortedMap<K,V> поэтому содержит все методы из этого класса
 *
 */
public class Test1 {
    public static void main(String[] args) {
        TreeMap<String,Integer> map0 = new TreeMap<>();
        map0.put("b",20);
        map0.put("c",30);
        map0.put("a",10);
        System.out.println(map0.toString()); // {a=10, b=20, c=30}

        /*
        Сортировка в обратном порядке
         */
        TreeMap<String,Integer> map1 = new TreeMap<>(Collections.reverseOrder());
        map1.put("b",20);
        map1.put("c",30);
        map1.put("a",10);
        System.out.println(map1.toString()); //{c=30, b=20, a=10}

        /*
        ИСпользование стороннего словаря, причем отсортированного в обратном порядке
         */
        TreeMap<String,Integer> map2 = new TreeMap<>(map1);
        map2.put("e",40);
        System.out.println(map2.toString()); // {e=40, c=30, b=20, a=10}

        /*
        Методы из интерфейса SortedMap

       firstKey() - возвращает первый ключ. Если словарь пустой то исключение генерируется
       lastKey() - возвращает последний ключ. Если словарь пустой то исключение генерируется
       др.
         */
        System.out.println(map0.firstKey()); //a
        System.out.println(map0.lastKey()); // c
    }
}
