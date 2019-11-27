package Alishev.middleleveljava.map.mapcomparison;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * HashMap - НЕТ СИЛЬНЫХ СТОРОН
 * LinkedHashMap - СИЛЬНАЯ СТОРОНА - сохраняет порядок добавления пар
 * TreeMap - СИЛЬНАЯ СТОРОНА - пары ключ-значение будут отсортированны по ключу
 */
public class Test {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>(); // внутри не гарантируется никакого порядка
        Map<Integer,String> linkedhashmap = new LinkedHashMap<>(); // гарантируется порядок добавления пар ключ значение. В каком порядке добавлены, в том и выведутся
        Map<Integer,String> treemap = new TreeMap<>(); // гарантирует что пары ключ-значение будут отсортированны по ключу. Для ключа  должен быть задан критерий сортировки( по умолчанию natural ordering)

        testMap(hashMap); // 0:Jerry 39:Bob 7:Niky 12:Mike 1500:Michal 78:John
        System.out.println();
        testMap(linkedhashmap); // 39:Bob 12:Mike 78:John 0:Jerry 1500:Michal 7:Niky
        System.out.println();
        testMap(treemap); // 0:Jerry 7:Niky 12:Mike 39:Bob 78:John 1500:Michal
    }

    public static void testMap(Map<Integer,String> map){
        map.put(39,"Bob");
        map.put(12,"Mike");
        map.put(78,"John");
        map.put(0,"Jerry");
        map.put(1500,"Michal");
        map.put(7,"Niky");

        for (Map.Entry<Integer,String> mapp : map.entrySet()){
            System.out.print(" "+mapp.getKey()+ ":"+ mapp.getValue());
        }
    }
}
