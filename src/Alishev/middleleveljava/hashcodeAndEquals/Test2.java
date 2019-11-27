package Alishev.middleleveljava.hashcodeAndEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Диллема!! Два идентичных по полям и ИД человека, однако интерфейсы их считают разными....
 * JAVA СРАВНИВАЕТ ОБЪЕКТЫ ПО АДРЕСУ В ПАМЯТИ, А АДРЕССА ОБЪЕКТОВ КЛАССА ВСЕГДВ РАЗНЫЙ И УНИКАЛЬНЫЙ. (hashCode)
 * вот этот вопрос и нужно решать
 */
public class Test2 {
    public static void main(String[] args) {
        Map<Person,String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person1 = new Person("Mike",1);
        Person person2 = new Person("Mike",1);

        map.put(person1,"123");
        map.put(person2,"123");

        set.add(person1);
        set.add(person2);

        System.out.println(map); // {Person{name='Mike', id=1}=123, Person{name='Catty', id=2}=123}
        System.out.println(set); // [Person{name='Mike', id=1}, Person{name='Catty', id=2}]



    }
}

class Person{
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';


    }
}