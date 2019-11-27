package Alishev.middleleveljava.hashcodeAndEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        map.put(1,"one");
        map.put(1,"another one");

        set.add(1);
        set.add(1);

        System.out.println(map); // {1=another one}
        System.out.println(set); // [1]

        /*
        ВОПРОС? КАК JAVA ОТПРЕДЕЛЯЕТ, ЧТО ЗНАЧЕНИЯ ИДЕНТИЧНЫ (И ПОЭТОМУ ИГНОРИТ)?
         */


    }
}
