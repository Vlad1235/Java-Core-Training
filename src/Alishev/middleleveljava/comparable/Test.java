package Alishev.middleleveljava.comparable;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Set<Person> personSet = new TreeSet<>();
        addElements(personList); // тут надо отдельно вызывать метод sort для сортировки
        addElements(personSet); // после того как мы в классе Person реализовали интерфейс comparable множество знает как отсортировать данные объекты
        System.out.println(personList); // [Person{id=3, name='Katy'}, Person{id=2, name='Tom'}, Person{id=4, name='Jack'}, Person{id=1, name='Bob'}]
        System.out.println(personSet); // [Person{id=1, name='Bob'}, Person{id=2, name='Tom'}, Person{id=3, name='Katy'}, Person{id=4, name='Jack'}]


    }

    private static void addElements(Collection collection) {
        collection.add(new Person(3, "Katy"));
        collection.add(new Person(2, "Tom"));
        collection.add(new Person(4, "Jack"));
        collection.add(new Person(1, "Bob"));
    }
}
