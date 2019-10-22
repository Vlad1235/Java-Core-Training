package GrokhaemAlgorytmyBook.SelectionSortAlgorythm;

import java.util.Arrays;

/**
 * Сортировка выбором. О(n^2)
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 7, 23, 12, 54, 8, 10, 56, 78, 13};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int min = arr[i];
            int minId = i;
                for(int j = i+1; j < arr.length; j++){
                    if(arr[j] < min){
                        min = arr[j];
                        minId = j;
                    }
                }
            int temp = arr[i];
            arr[i] = min;
            arr[minId] = temp;
        }
    }
}
/*
[4, 7, 23, 12, 54, 8, 10, 56, 78, 13]
[4, 7, 8, 10, 12, 13, 23, 54, 56, 78]
 */