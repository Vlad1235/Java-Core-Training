package ProhorenokBook.Collections.Map_usage.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap<K,V> - описывает словарь, доступ к элементам которого осуществляется не по индексу, по уникальному ключу.
 * Чтобы получить доступ к элементу, нужно указать уникальный ключ, который исп при сохраниении элемента.
 * Для быстрого поиска служит хэш-таблица.
 */
public class Test1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("a",10);
        map.put("b",20);
        System.out.println(map.toString()); // {a=10, b=20}


        HashMap<String,Integer> map1  = new HashMap<>(16,0.75f);
        map1.put("a",12);
        map1.put("b",14);
        map1.put("c",16);
        System.out.println(map1.get("a")); //12
        System.out.println(map1.get("b")); // 14

        HashMap<String, Integer> map2 = new HashMap<>(map1);
        map2.put("d",18);
        System.out.println(map2.toString()); // {a=12, b=14, c=16, d=18}
    }
}
