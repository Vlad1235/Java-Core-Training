package ProhorenokBook.Arrays;

import java.util.Arrays;

public class Equals_array {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        int[] arr2 = new int[] {1,2,3,4,5};
        int[] arr3 = arr;
        /*
        Проверяет лишь сслылки, а не значения.
         */
        System.out.println(arr==arr2); // false
        System.out.println(arr==arr3); // true
        /*
        Проверяет соответствие длины и совпадение значений.
         */
        System.out.println(Arrays.equals(arr,arr2)); // true
        System.out.println(Arrays.equals(arr,arr3)); // true
        /*
        Ошибка прверять многомерные массивы таким образом!! Метод лишь ссылки будет сверять
         */
        int[][] arrayMany = new int[][] {{1,2,3,4},{5,6,7,8}};
        int[][] arrayMany2 = new int[][] {{1,2,3,4},{5,6,7,8}};
        int[][] arrayMany3 = arrayMany;
        System.out.println(Arrays.equals(arrayMany,arrayMany2)); //false (вот тут и ошибка! ссылки разные, но значения одинаковые)
        System.out.println(Arrays.equals(arrayMany,arrayMany3)); //true

        /*
        Использование метода deepEquals();
         */
        int[][] arrayMany4 = new int[][] {{1,2,3,4},{5,6,7,8}};
        int[][] arrayMany5 = new int[][] {{1,2,3,4},{5,6,7,8}};
        int[][] arrayMany6 = arrayMany4;
        int[][] arrayMany7 = new int[][] {{1,5,3,4},{5,10,7,8}};
        System.out.println(Arrays.deepEquals(arrayMany4,arrayMany5)); // true
        System.out.println(Arrays.deepEquals(arrayMany4,arrayMany6)); // true
        System.out.println(Arrays.deepEquals(arrayMany6,arrayMany7)); //false

    }
}
