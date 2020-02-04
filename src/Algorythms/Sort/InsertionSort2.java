package Algorythms.Sort;

import java.util.Arrays;

public class InsertionSort2 {

    public static void insertionSort(int[] array) {
        int index;
        int marker;
        for (marker = 1; marker < array.length; marker++) { // отмечаем крайний левый неотсортированный массив
            int tmp = array[marker];
            index = marker;
            while (index > 0 && array[index - 1] >= tmp) {  // следующий отсортированный элемент сдвигается на одну позицию вправо
                array[index] = array[index - 1];
                index--;
            }
            array[index] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] array = {-44, 5, 12, 16, 0, -5, 26, 1, 56};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
