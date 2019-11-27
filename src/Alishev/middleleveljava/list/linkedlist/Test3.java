package Alishev.middleleveljava.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkedList); // 10
        measureTime(arrayList); // 494
        /*
        Результат:
        Если добавлять элементы, но с указанием, что добавляться каждый раз в начало листа то 10 миллесекунд выбор LinkedList
         */
    }

    public static void measureTime(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add(0,i); // каждый раз добавление будет в ячейку с индексом 0, но так как она не пуста, то все элементы будут сдвигатся вправо, каждый раз!
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
