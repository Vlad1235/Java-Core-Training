package Alishev.middleleveljava.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Для сортировки строк и чисел уже по умолчанию в Java есть лексигографический порядок и числовой.
 * Ничего не нужно реализовывать и придумывать. Лишь только если мы сами хотим его изменить.
 */
public class Test {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("cat");
        animals.add("frog");
        animals.add("bird");

        Collections.sort(animals);
        System.out.println(animals); // [bird, cat, dog, frog] лексикографический порядок. По алфавиту английского или русского языка.Natural order

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);

        Collections.sort(numbers);
        System.out.println(numbers); //[0, 5, 100, 500]
    }
}
