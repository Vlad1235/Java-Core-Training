package Alishev.middleleveljava.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * паттерн  Pattern - когда мы составим регулярное выражение мы его поместим в класс Pattern
 * паттерн Matcher - этот класс использует наш паттерн для проведения операций над текстом, строкой
 *
 * Самое популярное использование это ПОИСК ПАТТЕРНА В КАКОМ-ТО ТЕКСТЕ. То есть поиск совпадения в тексте.
 * Пример:
 * есть текст и мы хотим найти в нем все адреса электронной почты
 * Мы составляем паттерн, он будет похож на адрес электронной почты, мы
 * его выразим с помощью регулярных выражений и замет используем его в  Matcher и
 * в нашем тексте найдем строки, которые совпадают с паттерном
 *
 */
public class Test3 {
    public static void main(String[] args) {
            String text = "Hello, Guys! I send you my email joe@gmail.com so we can\n"+
                    "keep in touch.Thanks, Joe! That's cool. I am sending you\n" +
                    "my address: tim@yandex.ru.Lets's stay in touch...";
            /*
            в классе Pattern приватный конструктр, поэтому мы не можем создавать экземпляры класса обычным сопособом.
              Такой способ создания в программировании называется паттерн Фабрика.
              Его смысл, что мы ограничиваем создание класса обычным способом,а взамен даем статический метод, который в результате
              своей работы создаем экземпляр класса.
              Почему так сделано с этим классом не понятно, просто запомнить!
             */
        Pattern email = Pattern.compile("\\w+@(gmail|yandex)\\.(com|ru)");
        Matcher matcher = email.matcher(text);

        while (matcher.find()){ //  с помощью метода find() нашли совпадения
            System.out.println(matcher.group()); //  с помощью метода group() вывели на экран их
        }
    }
}
/*
joe@gmail.com
tim@yandex.ru
 */