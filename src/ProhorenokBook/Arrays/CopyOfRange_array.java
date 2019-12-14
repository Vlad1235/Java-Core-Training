package ProhorenokBook.Arrays;

import java.util.Arrays;

/**
 * Копирование лишь определенного диапазона значений из старого массива в новый.И другие доп полезные свойства.
 */
public class CopyOfRange_array {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6}, arr2;
        arr2 = Arrays.copyOfRange(arr,0,arr.length); // тут тотже функционал что и у copyOf()
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        arr2[0] = 777;
        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 5, 6]
        System.out.println(Arrays.toString(arr2)); //[777, 2, 3, 4, 5, 6]
        arr2 = Arrays.copyOfRange(arr,2,arr.length);
        System.out.println(Arrays.toString(arr2)); //[3, 4, 5, 6]
        arr2 = Arrays.copyOfRange(arr,2,10); // Также можно и расшить массив
        System.out.println(Arrays.toString(arr2)); //[3, 4, 5, 6, 0, 0, 0, 0]

    }
}
/*
[1, 2, 3, 4, 5, 6]
[1, 2, 3, 4, 5, 6]
[1, 2, 3, 4, 5, 6]
[777, 2, 3, 4, 5, 6]
[3, 4, 5, 6]
[3, 4, 5, 6, 0, 0, 0, 0]
 */