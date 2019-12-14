package ProhorenokBook.Arrays;

import java.util.Arrays;

/**
 * Перемешивание элементов в массиве случайным образом.
 */
public class MixRandom_array {
    public static void shuffle(int[] arr){
        int tmp = 0, j=0;
        for(int i = 0; i<arr.length;i++){
            j = (int)(Math.random()*arr.length);
            if(i==j) continue;
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        shuffle(arr);
        System.out.println(Arrays.toString(arr));
        shuffle(arr);
        System.out.println(Arrays.toString(arr));
    }
}
/*
[1, 2, 3, 4, 5, 6, 7, 8]
[5, 4, 3, 1, 6, 7, 8, 2]
[3, 2, 5, 4, 6, 8, 7, 1]
 */