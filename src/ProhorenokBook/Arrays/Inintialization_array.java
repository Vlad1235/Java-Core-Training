package ProhorenokBook.Arrays;

import java.util.Arrays;

/**
 * Инициализация массива. 2 способа.
 */
public class Inintialization_array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        boolean[] arr2 = new boolean[4];
        String[] arr3 = new String[6];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = {10,20,30,40};
        printArr(arr4);
        printArr(new int[] {50,60,70});// создание аннонимного массива.
    }
    private static void printArr(int[] a){
        for(int i : a){
            System.out.print(i + "\t");
        }
    }
}
/*
[0, 0, 0, 0, 0]
[false, false, false, false]
[null, null, null, null, null, null]
10	20	30	40	50	60	70
 */