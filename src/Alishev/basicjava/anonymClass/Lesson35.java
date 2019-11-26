package Alishev.basicjava.anonymClass;

/**
 * Java для начинающих. Урок 35: Анонимные классы
 */
public class Lesson35 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        /*
        создаем анономиный класс, который наследуется от Animal и переопределяет нужный нам метод.
        То есть тут это наследник класса Animal, без фактического отдельного создания класса Animal
         */
        Animal animalAnonim = new Animal(){
                @Override
                public void eat(){
                    System.out.println("Other Animal is eating...");
                }
        };
        animalAnonim.eat();
    }
}
/*
Animal is eating...
Other Animal is eating...
 */
