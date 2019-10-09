package ProhorenokBook.Collections.Map_usage.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
          Map<String,Integer> map0 = new LinkedHashMap<>();
          map0.put("a",10);
          map0.put("b",20);
          map0.put("d",40);
          map0.put("e",50);
          map0.put("c",30);
        System.out.println(map0.toString()); // {a=10, b=20, d=40, e=50, c=30}
    }
}
