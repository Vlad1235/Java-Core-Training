package Alishev.AlgorythmsDataStructure.fibonachi;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibNaive(4));
        System.out.println(fibEffective(100));
        System.out.println(fibEffective(10));
    }

    // найвный медленный очевидный алгоритм O(2^n) - самый худший алгоритм
    private static long fibNaive(int n) {
        if (n <= 1) return n;
        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    // хороший алгоритм. Сложность выполнения О(n). Время выполнения растет пропорционально аргументу
    // Итоговая сложность Алгоритма: O(n)+ O(1)+O(1)+O(n)+O(1) = O(2n)+O(3) ИТОГО по правилу отбрасывая константы, итоговая сложность равняется O(n)

    private static long fibEffective(int n) {
        long[] arr = new long[n + 1]; //O(n)
        arr[0] = 0; // O(1) константная сложность
        arr[1] = 1;// O(1)
        for (int i = 2; i <= n; i++) { // O(n)
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        // итоговая сложность алгоритма O(n+n)=>O(2n)=>O(n), так как константу 2 мы не учитываем при больших числах и когда говорим об
        // АСИМТОТИЧЕСКОЙ СЛОЖНОСТИ АЛГОРИТМА
        return arr[n]; // O(1)
    }
}
/*
3
3736710778780434371
55
 */