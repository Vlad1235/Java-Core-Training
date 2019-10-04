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


        /*
        Удаление из списка все элементы, которые соответсвтуют значениям другой коллекции
         */
        List<Integer> arr3 = new ArrayList<Integer>();
        Collections.addAll(arr3,1,2);
        List<Integer> arr4 = new ArrayList<Integer>();
        Collections.addAll(arr4, 1,2,3,2);
        System.out.println(arr4.toString());//[1, 2, 3, 2]
        System.out.println(arr4.removeAll(arr3)); // true - удаляем из arr4 все значения arr3
        System.out.println(arr4.toString());//[3]


        /*
        Удаление определенных значений из списка
         */
        List<Integer> arr5 = new ArrayList<Integer>();
        Collections.addAll(arr5,1,2,3,4,5,6,7,8,9);
        System.out.println(arr5.toString());// [1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(arr5.removeIf(elem ->elem<5)); // true - удалим все элементы значения которых меньше 5
        System.out.println(arr5.toString()); //[5, 6, 7, 8, 9]
    }
}
