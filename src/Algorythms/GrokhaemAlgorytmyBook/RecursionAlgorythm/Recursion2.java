package Algorythms.GrokhaemAlgorytmyBook.RecursionAlgorythm;

import java.util.Arrays;

/**
 * Проссумируем массив используя рекурсию.
 */
public class Recursion2 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,3,5,8,10};
        int sum = recursion(arr);
        System.out.println(sum);
    }
    private static int recursion(int[] arr){
        if(arr.length == 0){
            return 0;
        } else {
            return arr[0] + recursion(Arrays.copyOfRange(arr,1,arr.length));
        }
    }
}
/*
27
 */