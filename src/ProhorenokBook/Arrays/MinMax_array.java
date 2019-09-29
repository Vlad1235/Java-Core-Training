package ProhorenokBook.Arrays;

import java.util.Arrays;

/**
 * 2 способа. Самому написать методы или использовать библиотеку Arrays.Stream API
 * Минимум или максимум в массиве если найти, то взять первый элемент и сравнивать его со всеми остальными элементами.
 */
public class MinMax_array {
    private static int max (int[] arr){
        int x = arr[0];
        for(int index = 0; index < arr.length; index +=1){
            if(x < arr[index]) x = arr[index];
        }
        return x;
    }

    private static int min (int[] arr){
        int x = arr[0];
        for(int index = 0; index < arr.length; index +=1){
            if(x > arr[index]) x = arr[index];
        }
        return x;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2,5,1,3};
        System.out.println("min = " + min(arr));
        System.out.println("max = " + max(arr));


        int[] arr2 = {2,5,1,3};
        int min = Arrays.stream(arr2).min().getAsInt();
        int max = Arrays.stream(arr2).max().getAsInt();
        System.out.println("min1 = " + min);
        System.out.println("max2 = " + max);
    }
}
/*
min = 1
max = 5
min1 = 1
max2 = 5
 */