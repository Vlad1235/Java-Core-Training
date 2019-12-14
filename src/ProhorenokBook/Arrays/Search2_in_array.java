package ProhorenokBook.Arrays;

import java.util.Arrays;

/**
 * Поиск в отсортированном массиве. Формула "-(возвращаемое значение) -1"
 */
public class Search2_in_array {
    public static void main(String[] args) {
        int[] arr = {10,5,6,1,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,10));
        System.out.println(Arrays.binarySearch(arr,8)); // Такого элемента нет в массиве, метод предложит куда его поставить. Причем с значение с минусом.
        System.out.println(-(Arrays.binarySearch(arr,8))-1); // Вычисление индекса куда бы поставить ненайденный элемент.
    }
}
/*
4
-5
4
* */