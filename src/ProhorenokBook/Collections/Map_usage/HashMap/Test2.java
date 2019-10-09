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



        /*
        Вставка элементов put(), putAll()
         */
        Map<String,Integer> map4 = new HashMap<String, Integer>();
        map4.put("a",100);
        map4.put("b",200);
        System.out.println(map4.toString()); //{a=100, b=200}
        Map<String,Integer> map5  = new HashMap<String, Integer>();
        map5.putAll(map4);
        System.out.println(map5.toString()); //{a=100, b=200}

        /*
        удаление элементов из словаря remove()
         */
        map5.remove("b");
        System.out.println(map5.toString()); // {a=100}

        /*
        Доступ к элементам get(),
        keySet() - возвращает множество с ключами
        values() - возвращает коллекцию ко значениями
         */

        Map<String, Integer> map6 = new HashMap<>();
        map6.put("a",10);
        map6.put("b",20);
        map6.put("c",30);
        map6.put("d",40);
        map6.put("e",50);
        map6.put("f",60);
        System.out.println(map6.toString()); // {a=10, b=20, c=30, d=40, e=50, f=60}

        System.out.println(map6.get("b")); // 20
        System.out.println(map6.keySet()); // [a, b, c, d, e, f]
        System.out.println(map6.values()); // // [10, 20, 30, 40, 50, 60]

        Set<String> set = map6.keySet();
        System.out.println(set.toString()); // [a, b, c, d, e, f]

        Collection<Integer> arr = map6.values();
        System.out.println(arr.toString()); // [10, 20, 30, 40, 50, 60]


        /*
        Замена значения по ключу replace()
         */
        System.out.println(map6.toString()); // {a=10, b=20, c=30, d=40, e=50, f=60}
        map6.replace("c",100);
        System.out.println(map6.toString()); // {a=10, b=20, c=100, d=40, e=50, f=60}

        /*
        Проверка существования ключа в словаре containsKey()
        Проверка существования элемента в словаре containsValue()
         */
        System.out.println(map6.containsKey("a")); // true
        System.out.println(map6.containsValue(100)); // true


        /*
        Перебор элементов словаря
         */
        for (String item: map6.keySet()){
            System.out.print(item + ": " + map6.get(item)); // a: 10b: 20c: 100d: 40e: 50f: 60
        }

        for (Map.Entry<String,Integer> item : map6.entrySet()){
            System.out.print(item.getKey() + ": " + item.getValue()); // 10b: 20c: 100d: 40e: 50f: 60
        }

        for(String item: map6.keySet()){
            map6.put(item, map6.get(item) * 2);
        }
        System.out.println(map6.toString()); // {a=20, b=40, c=200, d=80, e=100, f=120}
    }
}