package ProhorenokBook.Collections.PriorityQueue_usage;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Реализует очеред с приоритетом. Из очереди возвращается первым элемент с наибольшим приоритетом.
 * Принцип работы с классом почти эдентичен работе с ArrayDeque<E>, Queue<E>
 *
 */
public class Test1 {
    public static void main(String[] args) {
        /*
        add() - добавление
        remove() - возвращение и удаление элемента
        peek() - возрващение элемента с наибольшим приоритетом, но НЕ удаление его из очереди
         */
        PriorityQueue<Integer> arr0 = new PriorityQueue<>();
        arr0.add(1);
        arr0.add(2);
        arr0.add(3);
        arr0.add(4);
        System.out.println(arr0.size()); // 4
        while (!arr0.isEmpty()){
            System.out.print(arr0.remove() +" "); // 1 2 3 4
        }
        System.out.println(arr0.toString()); //  []

        /*
        Перебор элементов
         */
        PriorityQueue<Integer> arr1 = new PriorityQueue<>();
        Collections.addAll(arr1,1,2,4,5,6,7,8,9);
        for( Integer item: arr1){
            System.out.print(item + " "); // 1 2 4 5 6 7 8 9
        }
        /*
        peek() возрвщение элемента с наибольшим приоритетом
         */
        PriorityQueue<Integer> arr2 = new PriorityQueue<>();
        arr2.add(8);
        arr2.add(12);
        arr2.add(28);
        System.out.println(arr2.peek()); // 8
    }
}
