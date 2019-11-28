package Alishev.middleleveljava.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i <= 100000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        measureTime(linkedList); // 1451
        measureTime(arrayList); // 70

        System.out.println(linkedList.size()); // 90000
        System.out.println(arrayList.size()); // 90000
    }

    public static void measureTime(List<Integer> list) {

        long start = System.currentTimeMillis();
        for (int i = 50000; i>=40000;i--){
            list.remove(i);
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }


}
