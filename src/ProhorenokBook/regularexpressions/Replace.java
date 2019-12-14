package ProhorenokBook.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Для замены в строке с помощью регулярных выражений предназначены методы класса Matcher
 *
 * String replaceFirst() - ищет первое совпадение с шаблоном и заменяет его указанной строкой
 * String replaceAll() - ищет все совпадения с шаблоном и заменяет указанным значением
 *
 * Также можно использовать метод String replaceFirst() из класса String
 */
public class Replace {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher("10 20 30");
        System.out.println(m.replaceFirst("нашел")); //нашел 20 30

        /*
        метод String replaceFirst() из класса String
         */
        System.out.println("10 20 30".replaceFirst("[0-9]+","нашел"));//нашел 20 30

        Pattern p2 = Pattern.compile("[0-9]+");
        Matcher m2 = p2.matcher("10 20 30");
        System.out.println(m2.replaceAll("нашел")); // нашел нашел нашел

    }
}
