package ProhorenokBook.Arrays;

import java.util.Arrays;

/**
 * Изменение порядка следования элементов в массиве на противоположный.
 */
public class Reverse_array {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] array){
        int tmp = 0;
        for(int i = 0, j = array.length - 1; i<j; i++,j--){
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }
}
/*
[1, 2, 3, 4, 5]
[5, 4, 3, 2, 1]
[1, 2, 3, 4, 5]
 */