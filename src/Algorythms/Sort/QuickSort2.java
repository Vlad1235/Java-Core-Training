package Algorythms.Sort;

import java.util.Arrays;

public class QuickSort2 {

    public static void main(String[] args) {
        int[] array = {3, -1, 0, 34, -5, 12, 1, 2, 5, 5, 10};
         quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        //выбираем середину в качестве опорного элемента
        int mid = arr[(low + high) / 2];
        //сдвигаем меньшие члены влево от опорного, а большие вправо
        do {
            while (arr[i] < mid)
                ++i;
            while (mid < arr[j])
                --j;
            if (i <= j) {
                if (i < j) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
                ++i;
                --j;
            }
        } while (i <= j);
        //теперь также сортируем левую и правую часть
        if (low < j)
            quickSort(arr, low, j);
        if (i < high)
            quickSort(arr, i, high);
    }
}
