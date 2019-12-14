package ProhorenokBook.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Регулярные выражения дают возможность осуществить поиск или замену в строке. Используются два класса
 * Класс Pattern - в нем описывается шаблон регулярного выражения
 * Класс Matcher - в нем реализуются методы по шаблону
 *
 * Чтобы проверить строку на полное соотсветсвие шаблону используется метод boolean matches()
 */
public class ClassicCheck_usage {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-z][0-9]+");
        Matcher m = p.matcher("a1225");
        if(m.matches()){
            System.out.println("Строка соотвествует шаблону");
        } else {
            System.out.println("Не соответсвует");
        }


        Pattern p2 = Pattern.compile("[0-9]+",Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE); //поиск без учета регистра символов в латинских и русских буквах
        Matcher m2 = p2.matcher("123Строка245");
        while (m2.find()){
            System.out.println(m2.group());
        }
    }
}
/*
Строка соотвествует шаблону
123
245
 */