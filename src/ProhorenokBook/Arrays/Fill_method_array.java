package ProhorenokBook.Arrays;

import java.util.Arrays;

/**
 * Использование метода fill() для заполнения элементов массива.
 */
public class Fill_method_array {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(Arrays.toString(arr)); // 0,0,0....
        Arrays.fill(arr,7);
        System.out.println(Arrays.toString(arr));

        String[] arr2 = new String[10];
        System.out.println(Arrays.toString(arr2));
        Arrays.fill(arr2,2,7,"10"); //можно и другие объекты вставлять. 7 индекс НЕ включительно!!!!!!!!!!
        System.out.println(Arrays.toString(arr2));
    }
}
/*
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
[7, 7, 7, 7, 7, 7, 7, 7, 7, 7]
[null, null, null, null, null, null, null, null, null, null]
[null, null, 10, 10, 10, 10, 10, null, null, null]
 */