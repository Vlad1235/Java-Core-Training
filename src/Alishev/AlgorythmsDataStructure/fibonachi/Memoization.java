package Alishev.AlgorythmsDataStructure.fibonachi;

import java.util.Arrays;

/**
 * Исправление рекурсивного алгоритма. Его проблема - он считает одно и тоже несколько раз.
 * Мы это исправляем с помощью техники мемоизации.
 */
public class Memoization {
    public static void main(String[] args) {
        int n = 100;
        long[] mem = new long[n+1]; // запоминание уже вычисленных значений
        Arrays.fill(mem,-1);
        System.out.println(fibNaive(n, mem));
    }

    // исправление рекурсивного метода
    private static long fibNaive(int n, long[] massive) {
        if (massive[n] != -1) return massive[n]; // если значение в ячейке -1, значит метод с таким аргументом мы еще не вызывали, и мы считаем дальше. Если мы уже вызывали данный метод с такими аргументами, тогда значит вместо -1 уже есть расчте и мы выдаем результат.
        if (n <= 1) return n;
        long result =  fibNaive(n - 1, massive) + fibNaive(n - 2, massive); // тут мы вычисляем число фибоначчи
        massive[n] = result; // записываем число в массив (второй раз уже его не рассчитаем)
        return result;
    }

}
