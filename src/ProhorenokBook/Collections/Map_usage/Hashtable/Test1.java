package ProhorenokBook.Collections.Map_usage.Hashtable;

import java.util.Hashtable;

/**
 * Класс <Hashtable<K,V> реализует словарь. В отличие от HashMap<K,V>  класс является синхронизированным, может использован для доступа из разных потоков.
 Из-за потерь на синхоронизацию работает медленнее, чем класс HashMap<K,V>
 Класс реализует интерфейс Map<K,V>  поэтому содержит все методы из этого класса
 Нет логики в выводе значений. Просто возвращает значения
 */
public class Test1 {
    public static void main(String[] args) {
        Hashtable<String, Integer> map0 = new Hashtable<>();
            map0.put("a",10);
            map0.put("b",30);
            map0.put("c",20);
            map0.put("d",60);
        System.out.println(map0.toString()); //{b=30, a=10, d=60, c=20}
        System.out.println(map0.toString()); //{b=30, a=10, d=60, c=20}

        Hashtable<String, Integer> map1 = new Hashtable<>(map0);
        map1.put("e",10);
        System.out.println(map1.toString()); //{b=30, a=10, e=10, d=60, c=20}
        System.out.println(map1.get("c")); //20
    }
}
