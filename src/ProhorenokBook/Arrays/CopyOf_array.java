package ProhorenokBook.Arrays;

import java.util.Arrays;

/**
 * Копирование элементов из одного в другой.
 */
public class CopyOf_array {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 5, 6}, arr2, arr3;
        arr2 = arr; // ВАЖНО!!!! копирование не массива, а лишь его ссылки!!! Запомнить!!
        arr2[0] = 10;
        System.out.println(Arrays.toString(arr)); //[10, 2, 4, 5, 6]
        System.out.println(Arrays.toString(arr2)); //[10, 2, 4, 5, 6]
        arr2 = Arrays.copyOf(arr,arr.length); // правельный способ копирования.
        arr2[0]  =8;
        System.out.println(Arrays.toString(arr2)); // изменился
        System.out.println(Arrays.toString(arr)); // не изменился

        arr3 = Arrays.copyOf(arr,10); // дополнительный бонус от использования - РАСШИРЕНИЕ МАССИВА.
        System.out.println(Arrays.toString(arr3));

    }
}
/*
[10, 2, 4, 5, 6]
[10, 2, 4, 5, 6]
[8, 2, 4, 5, 6]
[10, 2, 4, 5, 6]
[10, 2, 4, 5, 6, 0, 0, 0, 0, 0]
 */