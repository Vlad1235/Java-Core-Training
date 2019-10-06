package ProhorenokBook.Collections.LinkedList_usage;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Пример реализации очереди и стека
 */
public class MoreExamples {
    public static void main(String[] args) {
        // Очередь (первым пришел, первым ушел)
        Queue<Integer> arr = new LinkedList<Integer>();
        arr.offer(1);           // Добавляем элементы в очередь
        arr.offer(2);
        arr.offer(3);
        arr.offer(4);
        while (!arr.isEmpty()) { // Обрабатываем элементы
            System.out.print(arr.poll() + " ");
        } // 1 2 3 4
        System.out.println();
        Queue<Integer> arr2 = new LinkedList<Integer>();
        arr2.add(1);             // Добавляем элементы в очередь
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);
        while (!arr2.isEmpty()) { // Обрабатываем элементы
            System.out.print(arr2.remove() + " ");
        } // 1 2 3 4
        System.out.println();
        // Стек (последний уходит первым)
        Deque<Integer> arr3 = new LinkedList<Integer>();
        arr3.push(1);            // Добавляем элементы в стек
        arr3.push(2);
        arr3.push(3);
        arr3.push(4);
        while (!arr3.isEmpty()) { // Обрабатываем элементы
            System.out.print(arr3.pop() + " ");
        } // 4 3 2 1
    }

}
