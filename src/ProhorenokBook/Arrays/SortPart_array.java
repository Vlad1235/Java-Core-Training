package ProhorenokBook.Arrays;

import java.util.Arrays;
import java.util.Collections;// Необходим для обратной сортировки.

/**
 * Сортировка только выбранной части массива.Указать начальный и конечные индексы в рамках которых будет сортировка.
 */
public class SortPart_array {
    public static void main(String[] args) {
        int[] arr = new int[] {10,5,6,1,3};
        Arrays.sort(arr,0,3);
        System.out.println(Arrays.toString(arr));

        Integer[] arr2 = {3,5,6,4,10,15}; // Необходимо использовать класс обертку.
        Arrays.sort(arr2,0,3, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr2));
    }
}
/*
[5, 6, 10, 1, 3]
[5, 6, 10, 1, 3]
[6, 5, 3, 4, 10, 15]
* */