package Alishev.middleleveljava.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Если нужно чтобы по моему собственному классу я смог проходиться по какие-либо элементам используя foreach,
 * тогда нужно будет реализоваться интейрфейс Iterable
 *
 * Итератор проходится по всем элементам передивигая УКАЗАТЕЛЬ на элемент
 *
 * Общий смысл - чтобы можно было по своему созданному собственному классу(например класс библиотека) можно было проходится по элементам (книги)
 *вызываем метод iterator() который есть у всех классов, реализующих Iterable
 *
 *
 */

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();
        // так работали до Java 5
        while (iterator.hasNext()){ // true если есть элементы в списке
            System.out.println(iterator.next()); // возвращает каждый следующий элемент
        }

        // Java 5
        for (int x: list){ // foreach также под капотом имеет принцип работы итератора
            System.out.println(x);
        }
    }
}
