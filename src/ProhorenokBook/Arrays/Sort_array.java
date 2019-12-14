package ProhorenokBook.Arrays;

import java.util.Arrays;
import java.util.Collections; // Необходим для обратной сортировки.

/**
 * Сортировка массива
 */
public class Sort_array {
    public static void main(String[] args) {
        int[] arr = {4,6,2,7,8};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        /*
        Сортировка в обратном порядке. Более требовательные условия для использования.
         */
        Integer[] arr2 = {10,5,6,1,3}; // Необходимо использовать класс обертку.
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr2));

    }
}
/*
[4, 6, 2, 7, 8]
[2, 4, 6, 7, 8]
[10, 6, 5, 3, 1]
* */