package Algorythms.Sort;

import java.util.Arrays;

/**
 * Отсортировать массив методом "сортировки слиянием"
 */
public class MergeSort2 {
    public static void main(String[] args) {
        int[] array = {6, 1, 3, 5, 2, 4, 7, 8};
        int[] array2 = {3, -1, 0, 34, -5, 12, 1, 2, 5, 10};
        int[] array3 = {3, -1, 0, 34, -5, 12, 1, 2, 5, 5, 10};
        int[] sortedArray = sort(array3);
        System.out.println(Arrays.toString(sortedArray));
    }


    //рекурсивная функция сортировки частей массива
    public static int[] sort(int[] arr) {
        if (arr.length < 2) return arr;
        int m = arr.length / 2;
        int[] arr1 = Arrays.copyOfRange(arr, 0, m);
        int[] arr2 = Arrays.copyOfRange(arr, m, arr.length);
        return merge(sort(arr1), sort(arr2));
    }

    //слияние двух массивов в один отсортированный
    public static int[] merge(int[] arr1, int arr2[]) {
        int n = arr1.length + arr2.length;
        int[] arr = new int[n];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < n; i++) {
            if (i1 == arr1.length) {
                arr[i] = arr2[i2++];
            } else if (i2 == arr2.length) {
                arr[i] = arr1[i1++];
            } else {
                if (arr1[i1] < arr2[i2]) {
                    arr[i] = arr1[i1++];
                } else {
                    arr[i] = arr2[i2++];
                }
            }
        }
        return arr;
    }
}
