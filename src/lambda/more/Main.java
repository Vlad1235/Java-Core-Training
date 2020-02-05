package lambda.more;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        // функциональный интерфейс Consumer. Его метод accept(). Выполяняет какое-то действие, которое ничего не возвращает
        Consumer<String> printer = System.out::println; // ссылка на статический метод
        printer.accept("Hello world"); //  просто вывести строку на консоль

        // сслыка на статический метод
        Consumer<String> printer2 = Main::printLn; // сслыка на статический метод мы сами создали (и тип должен совпадать с принимающим значением аргумента)
        printer2.accept("Hello user");

        // ссылка на конструктор
        Database database = User::new; // пишем название класса, на который будем сслылаться и добавляем new
        User user = database.create("Name","root"); // передаем в конструктор класса User переменные
        System.out.printf("Name:%s \nPassword: %s ",user.getName(),user.getPassword()); // получить значения из класса
    }


    private static void printLn(String text){ // (тип аргумента должен совпадать)
        System.out.println(text);
    }
}
