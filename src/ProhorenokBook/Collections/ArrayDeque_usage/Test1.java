package ProhorenokBook.Collections.ArrayDeque_usage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  Класс ArrayDeque<E> - двусторонная очередь.
 *  Добавить элементы можно либо в начало либо в конец очереди.
 *  Получить элементы можно только с конца или с начала очереди.
 *  Нельзя хранить элементы со значением null
 *  Изначально пустая очередь это  емкость 16 элементов
 */
public class Test1 {
    public static void main(String[] args) {
        /*
        добавление элемента в начало очереди
        push()
        addFirst()
        offerFirst() - возвращает true если добавлен
         */
        /*
        добавление в конец очереди
        add()
        addLast()
        и др
         */
        ArrayDeque<Integer> arr0 = new ArrayDeque<>();
        arr0.push(20);
        arr0.addFirst(10);
        System.out.println(arr0.offerFirst(15)); // true
        System.out.println(arr0.toString()); // [15, 10, 20]

        ArrayDeque<Integer> arr1 = new ArrayDeque<>();
        arr1.add(20); // в конец
        arr1.addLast(10); // в конец конца
        arr1.push(18); // в начало
        System.out.println(arr1.toString()); // [18, 20, 10]

        /*
        Обычное добавление
         */
        ArrayDeque<Integer> arr4 = new ArrayDeque<>();
        Collections.addAll(arr4, 1,4,5,6,7,8);
        System.out.println(arr4.toString()); // [1, 4, 5, 6, 7, 8]

        /*
         * Добавляет элементы из другой коллекции. Использование метода addAll()
         */
        ArrayDeque<Integer> arr2 = new ArrayDeque<>();
        List<Integer> arr3 = new ArrayList<>();
        Collections.addAll(arr3, 1, 5, 7, 9, 11);
        arr2.addAll(arr3);
        System.out.println(arr2.toString()); // [1, 5, 7, 9, 11]
    }
}
