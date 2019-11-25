package Alishev.basicjava;


import java.util.ArrayList;
import java.util.List;

/**
 * Java для начинающих. Урок 33: Введение в параметризацию. (Generics)
 */
public class Lesson33 {
    public static void main(String[] args) {
        /*
        BEFORE Java 5
         */
        List animals = new ArrayList();
        Animal animal= new Animal();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
      //  animals.add(animal); Exception in thread "main" java.lang.ClassCastException: class Alishev.basicjava.lesson35.Animal cannot be cast to class java.lang.String
        // Ошибка. В АррауЛист могли положить любой класс
        String animal1 = (String)animals.get(1); // до 5 версии джава так работали с методом ArrayList. Руками приводили тип Object к нужному нам типу.
        System.out.println(animal1);

        /*
        AFTER Java 5. Появление Generics. Не даст ничего поместить кроме типа String
         */
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
        String animal2 = animals2.get(1);

        /*
        After Java 7. Справа не нужно указывать тип
         */
        List<String> animals3 = new ArrayList<>();

    }
}
class Animal {
}