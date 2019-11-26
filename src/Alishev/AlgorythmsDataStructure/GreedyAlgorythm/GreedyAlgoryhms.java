package Alishev.AlgorythmsDataStructure.GreedyAlgorythm;

import java.util.Arrays;
import java.util.Collections;

public class GreedyAlgoryhms {
    public static void main(String[] args) {
        int[] digits = {1, 3, 7, 9, 9, 5};
        System.out.println(maxNumberFromDigits(digits)); // 997531

    }

    public static String maxNumberFromDigits(int[] digits) {
        //{1,3,7,9,9,5} - > через сортировку {1,3,5,7,9,9}

//        // Прежде чем писать алгоритм  примерно проанализируем его будущую сложность
//        //O(n*log(n)) - быстрая сортировка (сортировка слиянием)
//        //O(n) - после получения отсортированного массива мы должны будем по не пройтись и все цифры сконкатенировать в одну строку
//
//        //O(n*log(n)) ИТОГОВАЯ сложность. Помним, что по правилу мы берем из всех сложностей одну наибольшую по сложности.
//
//        Arrays.sort(digits);
//        String result = "";
//        for (int i = digits.length - 1; i >= 0; i--) {
//            result += digits[i];
//        }
//        return result; // O(n*log(n)) ИТОГОВАЯ сложность.

        /*
        Второй вариант решения
         */
        return String.join("", Arrays.stream(digits).boxed()
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .toArray(String[]::new));
    }
}
