package ProhorenokBook.Collections.ArrayDeque_usage;

import java.util.ArrayDeque;
import java.util.Collections;

/**
 * Базование методы  Класса ArrayDeque<E>
 */
public class Test2 {
    public static void main(String[] args) {
    /*
    Колличество элементов
     */
        ArrayDeque<Integer> arr0 = new ArrayDeque<>();
        Collections.addAll(arr0,1,4,5,6,7,8);
        System.out.println(arr0.size()); // 6

    /*
    Удаление всех элементов
     */
     arr0.clear();
        System.out.println(arr0.toString()); // []

    /*
    Возвращение первого и последнего элемента из очереди и не удаляя его из очереди
     */
      ArrayDeque<Integer> arr1 = new ArrayDeque<>();
      Collections.addAll(arr1,1,4,5,6,7,8);
        System.out.println(arr1.getFirst()); // 1
        System.out.println(arr1.getLast()); // 8
        System.out.println(arr1.toString()); //[1, 4, 5, 6, 7, 8]

       /*
    Возвращение первого и последнего элемента из очереди и удаляя его из очереди
     */
        ArrayDeque<Integer> arr2 = new ArrayDeque<>();
        Collections.addAll(arr2,100,4,5,6,7,8);
        System.out.println(arr2.remove()); //100
        System.out.println(arr2.removeLast()); // 8
        System.out.println(arr2.toString()); // [4, 5, 6, 7]

        /*
        Проверка существования элемента
         */
        ArrayDeque<Integer> arr3 = new ArrayDeque<>();
        Collections.addAll(arr3,100,4,5,6,7,8);
        System.out.println(arr3.contains(6)); // true
        System.out.println(arr3.contains(100)); // true
        System.out.println(arr3.contains(125)); //false

        /*
        Использование метода frequency() из класса Collections для подсчета колличества одинаковых элементов
         */
        ArrayDeque<Integer> arr4 = new ArrayDeque<>();
        Collections.addAll(arr4,100,4,5,6,7,8, 123,8,8,43,8);
        System.out.println(Collections.frequency(arr4,8)); // 4
        System.out.println(Collections.frequency(arr4,15)); // 0

        /*
        максимальные и минимальные значения в очереди
         */
        Integer min = Collections.min(arr4);
        System.out.println(min); // 4
        Integer max = Collections.max(arr4);
        System.out.println(max); // 123
    }
}
