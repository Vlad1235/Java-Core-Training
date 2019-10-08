package ProhorenokBook.Collections.Map_usage.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("a",10);
        map.put("b",20);
        System.out.println(map.toString()); // {a=10, b=20}

    }
}
