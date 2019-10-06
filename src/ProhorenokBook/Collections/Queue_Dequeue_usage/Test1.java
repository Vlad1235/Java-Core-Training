package ProhorenokBook.Collections.Queue_Dequeue_usage;

import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * Интерфейс Queue<E> описывает одностороннюю очередь, интерфейс Deque<E> двустороннюю
 *
 * Интерфейсы Queue<E> и интерфейс Deque<E> реализуют классы:
 1. ArrayDeque<E> - двусторонная очередь.
 Добавить элементы можно либо в начало либо в конец очереди.
 Получить элементы можно только с конца или с начала очереди.
 2. LinkedList<E> - связанный список с возможностями  двусторонней очереди
 3. PriorityQueue<E> - реализует очередь с приоритетом
 */
public class Test1 {
    public static void main(String[] args) {
    /*
    Очередь первым пришел первым ушел FIFO
    обычная человеческая очередь, покупка жетона в метро, первым встал первым обслужили и ушел.
     */
    Queue<Integer> arr0 = new ArrayDeque<>();
    arr0.offer(1);
    arr0.offer(2);
    arr0.offer(3);
        while (!arr0.isEmpty()){
            System.out.print(arr0.poll() + " "); // 1 2 3
        }

     /*
     То же самое только в случае ошибки будет генерироваться исключение
      */
        Queue<Integer> arr1 = new ArrayDeque<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        while (!arr1.isEmpty()){
            System.out.print(arr1.remove() + " "); // 1 2 3 4
        }

        /*
        Реализация СТЕКА (последний пришел и первый ушел
         */
        Deque<Integer> arr2 = new ArrayDeque<>();
        arr2.push(1);
        arr2.push(2);
        arr2.push(3);
        arr2.push(4);
        while (! arr2.isEmpty()){
            System.out.print(arr2.pop() + " "); // 4 3 2 1
        }

    }
}
