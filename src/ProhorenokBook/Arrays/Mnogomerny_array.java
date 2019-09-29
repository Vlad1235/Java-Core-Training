package ProhorenokBook.Arrays;

import java.util.Arrays;

/**
 * Многомерный массив - одномерны массив, элементы которого содержат ссылки на вложеные также одномерные массивы.
 */
public class Mnogomerny_array {
    public static void main(String[] args) {
        int[][] arr = new int[2][4]; // 2 строки 4 столбца.
        System.out.println(Arrays.deepToString(arr));
        int[][] arr2 = {{},{}}; // 2 строки и фиг знает сколько столцов.
        System.out.println(Arrays.deepToString(arr2));
    }
}
/*
[[0, 0, 0, 0], [0, 0, 0, 0]]
[[], []]
 */