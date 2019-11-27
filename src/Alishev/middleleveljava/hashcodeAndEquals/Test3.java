package Alishev.middleleveljava.hashcodeAndEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Почему тут работает все верно!!
 * Дело в том, что стандартные классы в Java  EQUALS() HASHCODE() УЖЕ ПЕРЕОПРЕДЕЛЕНЫ!
 */
public class Test3 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        set.add("Hello");
        set.add("Hello");

        System.out.println(set); // [Hello]


    }
}


