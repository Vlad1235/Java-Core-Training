package ProhorenokBook.Collections.Set_usage.HashSet_usage;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        /*
        Преобразование массива во множество и множества в массив
         */
        Integer[] arrInt = {1,2,3,8,9};
        Set<Integer> set0 = new HashSet<>();
        Collections.addAll(set0,1,2,3,4);
        Collections.addAll(set0,arrInt);
        System.out.println(set0.toString()); // [1, 2, 3, 4, 8, 9]

        /*
        Преобразовать множество в массив позволяет метод toArray()
         */
        Integer[] arrInt1 = set0.toArray(new Integer[0]);
        System.out.print(Arrays.toString(arrInt1)); // [1, 2, 3, 4, 8, 9]

        /*
        Перебор элементов множества
         */
        for (Integer item: set0){
            System.out.print(item + " "); // 1 2 3 4 8 9
        }

        Iterator<Integer> it = set0.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " "); // 1 2 3 4 8 9
        }
    }
}
