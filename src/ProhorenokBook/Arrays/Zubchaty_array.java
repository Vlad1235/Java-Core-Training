package ProhorenokBook.Arrays;

import java.util.Arrays;

/**
 * Многомерный массив - это массив массивов, ктр могут быть разной длины.
 */
public class Zubchaty_array {
    public static void main(String[] args) {
        int[][] arr = new int[4][];
        arr[0] = new int[] {1,2};
        arr[1] = new int[] {3,4,5};
        arr[2] = new int[] {6,7,8,9};
        arr[3] = new int[] {10,11,12,13};
        System.out.println(Arrays.deepToString(arr));

        int[][] arr2 = new int[4][];
        arr2[0] = new int[1];
        arr2[1] = new int[2];
        arr2[2] = new int[3];
        arr2[3] = new int[4];
        int n = 1;
        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[i].length; j++){
                arr2[i][j] = n;
                System.out.print(arr2[i][j] + "\t");
                n++;
            }
        }
    }
}
/*
[[1, 2], [3, 4, 5], [6, 7, 8, 9], [10, 11, 12, 13]]
1	2	3	4	5	6	7	8	9	10
 */