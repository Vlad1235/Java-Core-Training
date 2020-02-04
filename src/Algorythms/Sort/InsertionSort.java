package Algorythms.Sort;

import java.util.Arrays;

/**
 * Сортировка вставками
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {-44, 5, 12, 16, 0, -5, 26, 1, 56};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertSort(int[] array) {
        // пройти по массиву
        // выбираем элемент
        // устанавливаем элемент в отсортированной части массива на свое место в порядке

        int element;
        int indexToInsert; // индекс в отсортированной части массива
        for (int x = 0; x < array.length; x++) {
            element = array[x];
            indexToInsert = x;
            while (indexToInsert > 0 && array[indexToInsert - 1] > element) {
                array[indexToInsert] = array[indexToInsert - 1];
                indexToInsert--;
                array[indexToInsert] = element;
            }
        }
    }


}
