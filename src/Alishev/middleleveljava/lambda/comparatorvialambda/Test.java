package Alishev.middleleveljava.lambda.comparatorvialambda;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Hello", "GoodBye", "a", "ab");
//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length()>o2.length()) {
//                    return 1;
//                } else if(o1.length()<o2.length()) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });
//        System.out.println(list); //[a, ab, Hello, GoodBye]

        // Лямбду можно записывать в выражение, то есть присваивать ее итоговое значение
        Comparator<String> comparator = ((s1, s2) -> {
            if (s1.length() > s2.length()) return 1;
            else if (s1.length() < s2.length()) return -1;
            else return 0;
        });

        list.sort(comparator);
        System.out.println(list); //[a, ab, Hello, GoodBye]
    }
}
