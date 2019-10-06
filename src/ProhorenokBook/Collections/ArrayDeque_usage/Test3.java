package ProhorenokBook.Collections.ArrayDeque_usage;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;

/**
 * Преобразование массива в очередь и очереди в массив
 */
public class Test3 {
    public static void main(String[] args) {
        /*
        Массив в очередь
         */
        Integer[] arrInt = {1,2,3,4};
        ArrayDeque<Integer> arr0 = new ArrayDeque<>();
        arr0.addFirst(55);
        arr0.addFirst(35);
        System.out.println(arr0.toString()); // [35, 55]
        arr0.addFirst(75);
        System.out.println(arr0.toString()); // [75, 35, 55]
        Collections.addAll(arr0,arrInt); // добавляем в конец очереди
        System.out.println(arr0.toString()); // [75, 35, 55, 1, 2, 3, 4]
        System.out.println(Arrays.toString(arrInt)); // [1, 2, 3, 4]


        /*
        Очередь в массив
         */
        Integer[] arrInt2 = arr0.toArray(new Integer[arr0.size()]);
        System.out.println(Arrays.toString(arrInt2)); // [75, 35, 55, 1, 2, 3, 4]


        /*
        Перебор всех элеметов очереди теми же способами как из списка. Цикл, итератор
         */
        ArrayDeque<Integer> arr1 = new ArrayDeque<>();
        Collections.addAll(arr1,1,2,3,4,5);
        for(Integer item: arr1){
            System.out.print(item + " "); // 1 2 3 4 5
        }
    }
}
