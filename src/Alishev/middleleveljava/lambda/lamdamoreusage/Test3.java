package Alishev.middleleveljava.lambda.lamdamoreusage;

import java.util.*;
import java.util.stream.Collectors;

/**
 * предположим хотим провести несколько операций над массивом
 */
public class Test3 {
    public static void main(String[] args) {

        // Задача оставить в массиве только нечетные числа и после этого умножить их на 2
        int[] arr = new int[10];
        fillArr(arr);
        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        int[] newarray = Arrays.stream(arr).filter(a -> a % 2 != 0).map(a -> a * 2).toArray();
        System.out.println(Arrays.toString(newarray)); // [2, 6, 10, 14, 18]


        // Можно работать с любым типом коллекции
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(5);
        System.out.println(set); // [1, 2, 5]
        set = set.stream().map(a -> a * 3).collect(Collectors.toSet());
        System.out.println(set); //[3, 6, 15]




    }

    private static void fillArr(int[] arr1) {
        for (int i = 0; i < 10; i++) {
            arr1[i] = i + 1;
        }
    }
}
