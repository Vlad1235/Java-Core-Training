package ProhorenokBook.Collections.List_usage.ArrayList_usage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Test9 {
    /**
    Сортировка.
     Начиная с Джава 8 метод sort(). Если в качестве параметра указать null, то бует произведена сортировка
     по возрастанию с использованием метода compareTo() из интерфейса Comparable<T>
     */
    public static void main(String[] args) {
        /*
        Обычная сортировка
         */
            List<Integer> arr0 = new ArrayList<>();
            Collections.addAll(arr0,14,53,2352,64,4,3,52,0,45,1);
            arr0.sort(null);
            System.out.println(arr0.toString()); // [0, 1, 3, 4, 14, 45, 52, 53, 64, 2352]
        /*
        Если нужно выполнить сортировку объектов, не поддреживающих интерфейс Comparable<T>, или отсортировать
        список в обратном порядке, то можно реализовать интерфейс Comparator<T>
         */
            List<Integer> arr1 = new ArrayList<>();
            Collections.addAll(arr1,14,53,2352,64,4,3,52,0,45,1);
                arr1.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2.compareTo(o1);
                 }
             });
            System.out.println(arr1.toString()); //[2352, 64, 53, 52, 45, 14, 4, 3, 1, 0]

        /*
        Начиная с Джава 8 внутри интерфейса Comparator<T> добавлены статические методы naturalOrder() и reverseOrder()
        - для сортировки по возрастанию и убыванию.
         */
        List<Integer> arr2 = new ArrayList<>();
        Collections.addAll(arr2,14,53,2352,64,4,3,52,0,45,1,5,125,6,1532,7,567,8,954,9,99);
        arr2.sort(Comparator.naturalOrder());
        System.out.println(arr2.toString()); // [0, 1, 3, 4, 5, 6, 7, 8, 9, 14, 45, 52, 53, 64, 99, 125, 567, 954, 1532, 2352]
        arr2.sort(Comparator.reverseOrder());
        System.out.println(arr2.toString()); // [2352, 1532, 954, 567, 125, 99, 64, 53, 52, 45, 14, 9, 8, 7, 6, 5, 4, 3, 1, 0]

        /*
        В классе Collections также есть свои методы для сортировки
         */
        List<Integer> arr3 = new ArrayList<>();
        Collections.addAll(arr3,14,53,2352,64,4,3,52,0,45,1,5,125,6,1532,7,567,8,954,9,99);
        Collections.sort(arr3);
        System.out.println(arr3.toString()); // [0, 1, 3, 4, 5, 6, 7, 8, 9, 14, 45, 52, 53, 64, 99, 125, 567, 954, 1532, 2352]
        Collections.sort(arr3,Collections.reverseOrder());
        System.out.println(arr3.toString()); // [2352, 1532, 954, 567, 125, 99, 64, 53, 52, 45, 14, 9, 8, 7, 6, 5, 4, 3, 1, 0]
        Collections.sort(arr3,(x, y)-> {
            return x.compareTo(y);
        });
        System.out.println(arr3.toString()); // [0, 1, 3, 4, 5, 6, 7, 8, 9, 14, 45, 52, 53, 64, 99, 125, 567, 954, 1532, 2352]
        Collections.sort(arr3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(arr3.toString()); //[2352, 1532, 954, 567, 125, 99, 64, 53, 52, 45, 14, 9, 8, 7, 6, 5, 4, 3, 1, 0]
    }
}
