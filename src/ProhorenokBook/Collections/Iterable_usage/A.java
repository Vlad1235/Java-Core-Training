package ProhorenokBook.Collections.Iterable_usage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Интерфейс Iterable <T> , Iterator<T> используются для перебора элементов коллекции,
 * или любых объектов с помощью цикла  for each
 * Интерфейс содержит один метод iterator()
 */
public class A {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        Collections.addAll(arr,1,3,5,7,9);
        System.out.println(arr.toString()); // [1, 3, 5, 7, 9]
        Iterator<Integer> it = arr.iterator();
        /*
        Изначально позиция указателя всегда между элементами. Сразу после создания итератора указатель находится перед
        первым элементом, поэтому при вызове remove() произойдет ошибка.
         */
        it.next(); // перемещает указатель на одну позицию и возвращает элемент слева от указателя
        it.remove(); // удаляет элемент слева от указателя
        System.out.println(arr.toString()); // [3, 5, 7, 9]

        it.next(); // надо самому переместить указатель иначе выкинет ошибку
        it.remove();
        System.out.println(arr.toString()); // [5, 7, 9]
        /*
        Используя циклы можно обоити все элементы коллекции
         */
        List<Integer> arr2 = new ArrayList<Integer>();
        Collections.addAll(arr2,1,3,5,7,9,11,13,15,17,19);
        System.out.println(arr2.toString());
        Iterator<Integer> it2 = arr2.iterator();
        /*
        hasNext() - метод, который  возвращает значение true если можно получить следующий элемент коллекции
         */

        arr2.forEach(elem -> System.out.print(elem + " ")); //1 3 5 7 9 11 13 15 17 19
        System.out.println();

        while( it2.hasNext()){
            System.out.print(it2.next() + " "); //1 3 5 7 9 11 13 15 17 19
        }
        System.out.println();

        for (Integer i: arr2){
            System.out.print(i + " "); // 1 3 5 7 9 11 13 15 17 19
        }
    }
}
/*
[1, 3, 5, 7, 9]
[3, 5, 7, 9]
[5, 7, 9]
[1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
1+3+5+7+9+11+13+15+17+19+
1 3 5 7 9 11 13 15 17 19
 */