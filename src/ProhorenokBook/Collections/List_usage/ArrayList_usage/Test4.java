package ProhorenokBook.Collections.List_usage.ArrayList_usage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Удаление элементов
 */
public class Test4 {
    public static void main(String[] args) {
        List<Integer> arr0 = new ArrayList<Integer>();
        Collections.addAll(arr0, 1,3,4,5,6,7);
        System.out.println(arr0.toString()); // [1, 3, 4, 5, 6, 7]
        arr0.clear(); // удаление всех элементов из списка
        System.out.println(arr0.toString()); // []

        /*
        Выборочное удаление по индексу
         */
        List<Integer> arr1 = new ArrayList<Integer>(Collections.nCopies(10, 45));
        System.out.println(arr1.toString()); // [45, 45, 45, 45, 45, 45, 45, 45, 45, 45]
        arr1.subList(0,5).clear(); // последний не включается
        System.out.println(arr1.toString()); // [45, 45, 45, 45, 45]
        /*
        Удаление одного элемента по индексу
         */
        List<Integer> arr2 = new ArrayList<Integer>();
        Collections.addAll(arr2, 1,4,5,6,72,67,24);
        System.out.println(arr2.remove(0)); // 1
        System.out.println(arr2.toString()); // [4, 5, 6, 72, 67, 24]
    }
}
