package Alishev.basicjava.anonymClass.example2;

/**
 * Пример 2 использования Анонимных классов.
 *
 * НЕ ХОТИМ СОЗДАВАТЬ ЦЕЛЫЙ КЛАСС, РАДИ ТОГО, ЧТОБЫ РЕАЛИЗОВАТЬ ОДИН МЕТОД
 */
public class Test {
    public static void main(String[] args) {
        /*
        // создается класс, в котором реализуется метод. НЕЛЬЗЯ СОЗДАВАТЬ ЭКЗЕМЛЯР ИНТЕРФЕЙСА! тут это не экзепляр интерфейса, это именно новый класс
         */
        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };
        animal.eat();
    }
}
