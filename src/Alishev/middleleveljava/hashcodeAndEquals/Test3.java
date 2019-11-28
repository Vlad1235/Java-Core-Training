package Alishev.middleleveljava.hashcodeAndEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Почему тут работает все верно!!
 * Дело в том, что в стандартных классах в Java например String, методы EQUALS() HASHCODE() УЖЕ ПЕРЕОПРЕДЕЛЕНЫ!
 */
public class Test3 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        set.add("Hello"); // это удаляется
        set.add("Hello");

        map.put("hello","old version");
        map.put("hello","new unique"); // переименовал значения старого ключа

        String s = map.get("hello");

        System.out.println(set); // [Hello]
        System.out.println(map); //{hello=new unique}
        System.out.println(s); // new unique


    }
}


