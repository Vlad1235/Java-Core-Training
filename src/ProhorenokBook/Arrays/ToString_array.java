package ProhorenokBook.Arrays;

import java.util.Arrays;

/**
 * Массив в сроку
 */
public class ToString_array {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1,2,3,4};
        int[][] arr2 = {{1,2,3,4},{4,5,6,7,6}};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.deepToString(arr2));
    }
}
/*
[1, 2, 3, 4]
[[I@7c30a502, [I@49e4cb85]
[[1, 2, 3, 4], [4, 5, 6, 7, 6]]
 */