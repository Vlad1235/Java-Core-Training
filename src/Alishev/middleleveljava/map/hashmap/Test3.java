package Alishev.middleleveljava.map.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * HashSet не имеет собственной реализации, в своей работе он опирается на HashMap.
 * То есть внутри HashSet мы ПРОСТО ОТСЕКАЕМ ЗНАЧЕНИЯ У HASHMAP И ПОЛЬЗУЕМСЯ, ЧТО HASHMAP ОБЕСПЕЧИВАЕТ НАМ УНИКАЛЬНЫЕ КЛЮЧИ
 * Разработчики Java немного поленились и не сделали собственной реализации для HashSet
 *
 * HashMap в Java реализован как МАССИВ linkedList"ов!!!!!
 *
 * Обязательным условием для HashMap это хорошо работающая Хеш функция!!!
 */
public class Test3 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Bob",25);
        map.put("Katty",15);
        map.put("Bill",40);

        Set<String> set = new HashSet<>();
    }
}
