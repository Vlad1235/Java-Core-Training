package ProhorenokBook.Arrays.Sorting;

import java.util.Arrays;

/**
 * Также метод для копирования массива
 */
public class Arraycopy_array {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5}, arr2 = new int[5];
        System.arraycopy(arr1,0,arr2,0,arr1.length); // arr1.length - это количество копируемых элементов. Главное, чтобы arr2 по длине подходил, чтобы все влезло, иначе ошибка.
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        arr2[0] = 33;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        /*
        Скопируем только 3 элемента из массива arr1 с индекса 2 и вставим их, начиная с позиции, имеющей индекс 1 в массив arr2.
         */
        arr1 = new int[]{1,2,3,4,5};
        arr2 = new int[6];
        System.arraycopy(arr1,2,arr2,1,3);
        System.out.println(Arrays.toString(arr1)); //[1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(arr2)); //[0, 3, 4, 5, 0, 0]

    }
}
/*
[1, 2, 3, 4, 5]
[1, 2, 3, 4, 5]
[1, 2, 3, 4, 5]
[33, 2, 3, 4, 5]
[1, 2, 3, 4, 5]
[0, 3, 4, 5, 0, 0]
 */