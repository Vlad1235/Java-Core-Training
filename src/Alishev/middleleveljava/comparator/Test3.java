package Alishev.middleleveljava.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(3,"Mike"));
        people.add(new Person(1,"Bob"));
        people.add(new Person(2,"Jack"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId()>o2.getId()) return 1;
                if (o1.getId()<o2.getId()) return -1;
                else return 0;
            }
        });
        System.out.println(people); //[Person{id=1, name='Bob'}, Person{id=2, name='Jack'}, Person{id=3, name='Mike'}]
    }
}
