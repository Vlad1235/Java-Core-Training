package Alishev.middleleveljava.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkedList); // 3903 считываение всех элементов в List заняло почти 4 секунды!
        measureTime(arrayList); // 4
        /*
        Результат:
        Если считывать просто элементы то 4 миллесекунд выбор ArrayList
         */
    }

    public static void measureTime(List<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0;i<100000;i++){
            list.get(i);
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
