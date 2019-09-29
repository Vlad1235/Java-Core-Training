package ProhorenokBook.Arrays;

import java.util.Arrays;

/**
 * Способ расширения массива, без использования более сложных схем!!!!
 */
public class Expand_array {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30};
        int[] arr2 = {10,20,30,40};
        System.out.println(Arrays.toString(arr1));
        arr1 = arr2;
        System.out.println(Arrays.toString(arr1));
    }
}
/*
[10, 20, 30]
[10, 20, 30, 40]
 */