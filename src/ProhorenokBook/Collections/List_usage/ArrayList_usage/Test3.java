package ProhorenokBook.Collections.List_usage.ArrayList_usage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
   Вставка элементов. В начало, В конец, копировать целую коллекцию другую
    */
public class Test3 {
    public static void main(String[] args) {
        /*
        Последовательно добавлять
         */
        List<Integer> arr0 = new ArrayList<Integer>();
        arr0.add(15);
        arr0.add(12);
        System.out.println(arr0.size()); // 2
        /*
        Добавить с конца
         */
        arr0.add(arr0.size(),17);
        arr0.add(arr0.size(),20);
        System.out.println(arr0.toString()); // [15, 12, 17, 20]
        /*
        ДОбавление элементов из другой коллекции, c указанного места
         */
        List<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(0,89); // способ добавить последовательно
        arr1.add(189);
        arr1.addAll(0,arr0); // вставить с начала списка
        System.out.println(arr1.toString()); // [15, 12, 17, 20, 89, 189]
        /*
        Использование стороннего статического метода из класса Collections()  для добавления элементов
         */
        Integer[] arrInt = {1,2,3};
        List<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(0,58);
        Collections.addAll(arr2,arrInt);
        System.out.println(arr2.toString()); // [58, 1, 2, 3]
        /*
        Общий самый сложный способ добавить элементы. Причем потерять можно в оригинально массиве значения!!
         */
        List<Integer> arr3 = new ArrayList<Integer>(20);
        Collections.addAll(arr3,3,5,6,7,8,6);
        List<Integer> arr4 = new ArrayList<Integer>(20);
        Collections.addAll(arr4, 5,6,0,3);
        Collections.copy(arr3,arr4); // копировать из одного списка в начало другого
        System.out.println(arr3.toString()); // [5, 6, 0, 3, 8, 6]
    }
}
