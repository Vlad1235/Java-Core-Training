package Alishev.middleleveljava.queue;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Очередь. Какой элемент помещен в коллекцию раньше других, тот и будет вытащен из коллекции раньше других FIFO.
 * Первый защел первый вышел
 * LinkedList реализует интерфейс Queue
 *
 * Пример
 * Много потоков обращаются к одному ресурсу и тут нужно выстраивать очередь. Поток который пришел к ресурсу раньше всех, должен получить доступ к ресурсу раньше всех
 *
 */
public class Test {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

        Queue<Person> people = new LinkedList<>(); // не ограничено в количестве народа в очереди. Пока хватит памяти.
        people.add(person3); // третий человек пришел первым в очередь, он стоит первым
        people.add(person2); // потом присоединился второй
        people.add(person4);
        people.add(person1); // последний пришел первый человек

        // очередь сейчас такова: person3 <-person2 <-person4 <-person1

        for (Person person: people){
            System.out.println(person);
        }

    }
}
/*
Person{id=3}
Person{id=2}
Person{id=4}
Person{id=1}
 */