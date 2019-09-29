package Info_to_method;

/**
 * Суммирование произвольного количества целых чисел типа int.
 */
public class MyClass {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4,5));
        int[] arr = new int[] {1,2,3,4,5};
        System.out.println(sum(arr));
    }

    public static int sum(int...a){
        int result = 0;
        System.out.println("Значений: " + a.length);
        for (int b: a) {
            result += b;
        }
        return result;
    }

}
/*
Значений: 3
6
Значений: 5
15
Значений: 5
15
 */