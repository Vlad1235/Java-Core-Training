package Alishev.basicjava.generics;


import java.util.ArrayList;
import java.util.List;

/**
 * Java для начинающих. Урок 34: Wildcards (Generics)
 */
public class Lesson34 {
    public static void main(String[] args) {
        List<Animal> listofanimals = new ArrayList<>();
        listofanimals.add(new Animal(1));
        listofanimals.add(new Animal(2));

        List<Dog> listofdogs = new ArrayList<>();
        listofdogs.add(new Dog());
        listofdogs.add(new Dog());

        test(listofanimals);
        test(listofdogs); // просто так не прокатит как в полиморфизме. необходимо в методе прописать ? extends Animal

        /*
        List<? extends Animal> list означает, что в иерархии наследования
        Object
        Animal - могу видеть в качестве аргумента (ниже по иерархии наследования)
        Dog    - могу видеть в качестве аргумента
         */
    }

    private static void test(List<? extends Animal> list){     // ? это назвается WildCard. Любые наследники от Animal
        for (Animal animal:list){
            animal.eat();
        }
    }
}
/*
Animal is eating..
Animal is eating..
Animal is eating..
Animal is eating..
 */