package HeadFirstJava.Collections.HashMap;

import java.util.HashMap;

/**
 * Отображение в качестве коллекции.
 */
public class HashMap_usage {
    public static void main(String[] args) {
        HashMap<String,Integer> scores = new HashMap<String, Integer>();
        scores.put("Katty", 42);
        scores.put("Bert", 343);
        scores.put("Skyller", 420);
        System.out.println(scores);
        System.out.println(scores.get("Bert"));
    }
}
/*
{Skyller=420, Bert=343, Katty=42}
343
 */