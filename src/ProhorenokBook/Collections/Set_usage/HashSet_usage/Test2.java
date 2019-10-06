package ProhorenokBook.Collections.Set_usage.HashSet_usage;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        /*
        Определение количества элементов
         */
        Set<Integer> set0 = new HashSet<>();
        Collections.addAll(set0,1,2,8,2,3,4,5,5,5,6,5,7,7,7,6,9,9,10,0);
        System.out.println(set0.size()); // 11 Важно! Уникальныйх элементов идет счет
        System.out.println(set0.toString()); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        Set<Integer> set1 = new HashSet<>(Collections.nCopies(5,7));
        System.out.println(set1.size()); // 1
        System.out.println(set1.toString()); // [7]


        /*
        Удаление элементов
         */
        Set<Integer> set2 = new HashSet<>();
        Collections.addAll(set2,1,2,3,5,4,6,6,6);
        System.out.println(set2.toString()); // [1, 2, 3, 4, 5, 6]
        set2.clear(); // всех до единого
        System.out.println(set2.toString()); //[]
        Collections.addAll(set2,1,4,5,6,2,7,8,8,9,10);
        System.out.println(set2.toString()); // [1, 2, 4, 5, 6, 7, 8, 9, 10]
        set2.remove(1);
        set2.remove(7);
        System.out.println(set2.toString()); // [2, 4, 5, 6, 8, 9, 10]
        List<Integer> list0 = new ArrayList<>();
        Collections.addAll(list0,2,4,6,8);
        System.out.println(list0.toString()); // [2, 4, 6, 8]
        set2.removeAll(list0);  // удаление из множества всех элементов, соответсвующих элеметам указанной другой коллекции
        System.out.println(set2.toString()); // [5, 9, 10]
        set2.add(4);
        set2.add(2);
        set2.add(1);
        System.out.println(set2.toString()); // [1, 2, 4, 5, 9, 10]
        set2.removeIf(elem ->elem<5); // удаление с условием
        System.out.println(set2.toString()); // [5, 9, 10]
        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1,1,5,10,12,14);
        set2.retainAll(list1); // удаление элементов из множества, которые не присутствуют в указанной коллекции
        System.out.println(set2.toString()); // [5, 10]

        /*
        проверка существования элементов
         */
        System.out.println(set2.contains(5)); // true
    }
}
