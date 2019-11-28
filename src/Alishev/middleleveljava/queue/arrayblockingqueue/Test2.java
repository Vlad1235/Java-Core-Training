package Alishev.middleleveljava.queue.arrayblockingqueue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * разница в методах offer и add() - первый в случае ошибки НЕ ВЫБРОСИТ ИСКЛЮЧЕНИЕ, А ВТОРОЙ ВЫБРОСИТ.
 *  такая же разника между другими одинаковыми по функционалу методами element() and peek() и remove() and poll()
 */
public class Test2 {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

        Queue<Person> people = new ArrayBlockingQueue<Person>(3); // очереди места для 3х, а добавляем 4 элемента.
        System.out.println(people.offer(person3));
        System.out.println(people.offer(person2));
        System.out.println(people.offer(person4));
        System.out.println(people.offer(person1));

    }
}
/*
true
true
true
false
 */