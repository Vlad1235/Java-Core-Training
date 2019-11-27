package Alishev.middleleveljava.hashcodeAndEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Мы переопределили методы HashCode и Equals -
 * !!!!!ТО ЕСТЬ НАУЧИЛИ JAVA СРАВНИВАТЬ ОБЪЕКТЫ НЕ ПО АДРЕСУ В ПАМЯТИ, А ПО ПОЛЯМ КЛАССА!!!!!!!!!
 */
public class Test4 {
    public static void main(String[] args) {
        Map<Human,String> map = new HashMap<>();
        Set<Human> set = new HashSet<>();

        Human person1 = new Human("Mike",1);
        Human person2 = new Human("Mike",1);

        map.put(person1,"123");
        map.put(person2,"123");

        set.add(person1);
        set.add(person2);

        System.out.println(map); // {Human{name='Mike', id=1}=123}
        System.out.println(set); // [Human{name='Mike', id=1}]


    }
}

class Human{
    private String name;
    private int id;

    public Human(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    // Если все так круто и Хеш код может сравнить сам, зачем метод Equals()?
    // причина - ВОЗМОЖНАЯ ВЕРОЯТНОСТЬ КОЛЛИЗИИ!!! ЭТО КОГДА ПРОИЗВОЛЬНЫМ РАЗНЫМ ОБЪЕКТАМ  МОЖЕТ СООТВЕТСТВОВАТЬ ОДНО ЧИСЛО ФИКСИРОВАННОЙ ДЛИНЫ
    // ПРИ ВОЗНИКНОВЕНИИ КОЛЛИЗИИ ВЫЗЫВАЕТСЯ МЕТОД EQUALS, КОТОРЫЙ ОБЪЯВИТ, ЧТО КЛАССЫ РАВНЫ, ТОЛЬКО ЕСЛИ ВСЕ ПОЛЯ У ОБОИХ СРАВНИВАЕМЫХ КЛАССОВ ИДЕНТИЧНЫ.
    // ПОЭТОМУ ОН МЕДЛЕНЕЕ, ОН СРАВНИВАЕТ А ПОЛЕЙ МОЖЕТ БЫТЬ ДОФИГА
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (id != human.id) return false;
        return name != null ? name.equals(human.name) : human.name == null;
    }


    //Это функция, которая преобразует входной объект ПРОИЗВОЛЬНОЙ длины в битовую последовательность(число) ФИКСИРОВАННОЙ ДЛИНЫ
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + id;
        return result;
    }
}