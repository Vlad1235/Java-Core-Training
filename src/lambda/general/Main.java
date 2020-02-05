package lambda.general;

import java.util.Scanner;
import java.util.function.*;

// другие интерфейсы обощенного типа
public class Main {
    public static void main(String[] args) {
        // функциональный интерфейс Predicate
        Predicate<Integer> isZero = value -> value == 0; // c помощью метода test интерфейса Predicate выполняется проверка какого-то условия. Если выполняется то true
        System.out.println(isZero.test(5)); // false проверим число является ли нулем
        System.out.println(isZero.test(0)); // true


        // функциональный интерфейс Consumer. Его метод accept(). Выполяняет какое-то действие, которое ничего не возвращает
        Consumer<String> printer = string -> System.out.println(string);
        printer.accept("Hello world"); //  просто вывести строку на консоль

        // функциональный интерфейс Function. Метод apply(). Переводит объект из типа T в другой тип R
        Function<Integer, Double> converter =  value -> Double.valueOf(value);
        System.out.println(converter.apply(1)); // число из формата int в формат double 1.0

        // функциональный интерфейс Supplier. метод get(). Не принимает никаких аргументов, но возвращает тип T
        Supplier<String> text = ()->{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter text");
            return scanner.nextLine();
        };
        System.out.println(text.get()); // вывести текст на консоль

        // функциональный интерфейс UnaryOperator. метод apply(). Позволяет выполнять унарные операции над объектом типа Т
        UnaryOperator<Double> sqrt = value -> Math.sqrt(value); // вычислить корень числа
        System.out.println(sqrt.apply(4.0)); // 2.0

        // функциональный интерфейс BinaryOperator. Метод apply() Позволяет выполнять бинарные операции над объектами
        BinaryOperator<Double> pow = (value3, value4) -> Math.pow(value3,value4);
        System.out.println(pow.apply(5.0,2.0)); // 25.0

    }
}
