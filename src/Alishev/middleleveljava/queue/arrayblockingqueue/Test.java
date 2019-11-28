package Alishev.middleleveljava.queue.arrayblockingqueue;


import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * ArrayBlockingQueue - класс который использует в многопоточности
 */
public class Test {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

        Queue<Person> people = new ArrayBlockingQueue<Person>(10); // обязательно указать число в очереди. Если она полная то новый класс не добавить
        people.add(person3);
        people.add(person2);
        people.add(person4);
        people.add(person1);

        // очередь сейчас такова: person3 <-person2 <-person4 <-person1

        System.out.println(people); // [Person{id=3}, Person{id=2}, Person{id=4}, Person{id=1}]
        System.out.println(people.remove()); // Person{id=3} достали элемент из очереди и удалили!
        System.out.println(people.peek()); //  Person{id=2} достали элемент из очереди и ПРОСТО посмотрели!
        System.out.println(people); // [Person{id=2}, Person{id=4}, Person{id=1}]


    }
}
