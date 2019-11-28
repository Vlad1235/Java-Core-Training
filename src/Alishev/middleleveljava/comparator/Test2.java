package Alishev.middleleveljava.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * лексигорафический порядок отключается если подается компаратор в качестве аргумента
 */
public class Test2 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("aaff1");
        animals.add("dog");
        animals.add("cat");
        animals.add("frog");
        animals.add("ab");
        animals.add("bird");

        Collections.sort(animals,new StringLenghComparator()); // [ab, dog, cat, frog, bird, aaff1] строки по длине отсортированы
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);

        Collections.sort(numbers, new Comparator<Integer>() { // через анонимный класс
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1>o2) return -1;
                else if (o1<o2) return 1;
                else return 0;
            }
        });
        System.out.println(numbers); //[500, 100, 5, 0]


    }
}
