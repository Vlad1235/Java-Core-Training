package ProhorenokBook.Numbers;

/**
 * Передача в метод произвольного количества значений
 */
public class Example {
    public static void main(String[] args) {
        System.out.println(Example.sum(1, 2, 3));

        System.out.println(Example.sum(1, 2, 3, 4, 5, 6, 7));

        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(sum(arr));
    }

    public static int sum(int... a) {
        int result = 0; // это значени по умолчанию (вспомнить про оператор return)
        System.out.println("Значений: " + a.length);
        for (int b : a) {
            result += b;
        }
        return result;
    }
}
 /*
Значений: 3
6
Значений: 7
28
Значений: 5
15
  */