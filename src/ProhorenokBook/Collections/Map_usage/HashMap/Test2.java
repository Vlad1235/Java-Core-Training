package ProhorenokBook.Collections.Map_usage.HashMap;

import java.util.*;

import static java.util.Set.of;

public class Test2 {
    public static void main(String[] args) {
    /*
    Начиная с Джава 9 добавлены статические методы of() и ofEntries(), которые создают НЕИЗМЕНЯЕМЫЙ СЛОВАРЬ
     */
        Map<String, Integer> map0 = Map.<String, Integer> of();
        System.out.println(map0.size()); // 0
        // map.put("a",10);
        // Ошибка! Нельзя добавить элемент

        Map<String, Integer> map1 = Map.of("a",10,"b",20);
        System.out.println(map1); // {b=20, a=10}
        // map1.put("c",30);
        // Ошибка! Нельзя добавить элемент


        /*
        В Джава 10 добавлен метод copyOf() который создает словарь на основе другого словаря
         */
        var map2 = new HashMap<String,Integer>();
        map2.put("a",40);
        map2.put("b",50);
        Map<String,Integer> map3 = Map.copyOf(map2);
      //  map3.put("x",60); Ошибка! создать можно лишь точную копию словаря
        System.out.println(map3); // {a=40, b=50}
    }
}