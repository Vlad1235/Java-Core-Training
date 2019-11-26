package Alishev.basicjava.innerclass;

/**
 * Типы вложенных классов:
 * 1. Нестатический вложенный класс
 * 2. Статический вложенный класс
 * 3. Вложенные классы, которые находятся в методе
 */
public class Test {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(1); // с нестатическим вложенным классом внутри
        electrocar.start();

        Electrocar2.Battery battery = new Electrocar2.Battery(); // просто логически сгрупировали этот класс

    }
}
/*
Motor is starting...
Electrocar1is starting..

 */