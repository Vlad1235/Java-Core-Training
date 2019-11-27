package Alishev.middleleveljava.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Сравниваем производительность разных классов
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkedList); // 190
        measureTime(arrayList); // 66 -
        /*
        Результат:
        Если добавлять просто элементы то 66 миллесекунд выбор ArrayList
         */
    }

    public static void measureTime(List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i<1000000;i++){
            list.add(i);
        }
        long end = System.currentTimeMillis();

        System.out.println(end-start);
    }
}
