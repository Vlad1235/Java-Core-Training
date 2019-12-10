package ProhorenokBook.Arrays.Sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * Заполнение массива случайными числами. 2 способа.
 */
public class RandomFil_array {
    public static void main(String[] args) {
        byte[] arr = new byte[10];
        Random random = new Random();
        random.nextBytes(arr); // 1ый метод для заполнения случайными числами.
        for (byte x: arr) {
            System.out.print(x + " ");
        }
        System.out.println(); // просто для разледения.
        int[] arrOther = new int[5];
        fillRandom(arrOther,10);
        System.out.println(Arrays.toString(arrOther));
        fillRandom(arrOther,3);
        System.out.println(Arrays.toString(arrOther));
    }
public static void fillRandom(int[] arr, int n){ // заполнение псевдослуч числами, но в рамках устанвленного лимита.
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(n);
        }
}
}
/*
-54 56 -3 -7 -128 36 -2 -106 4 -103
[2, 3, 5, 2, 8]
[0, 2, 0, 1, 1]
 */