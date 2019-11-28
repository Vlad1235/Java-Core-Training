package Alishev.middleleveljava.regularexpressions;

/**
 * Регулярные выражения это инструмент который позволяет работать с текстом
 * Это ЯЗЫК, который позволяет описывать нам ПАТЕРНЫ В ТЕКСТЕ. Описав эти патерны мы можем потом работать с ними
 *
 *
 *
 *         напишем регулярные выражения, которые можно отправить в качестве аргумента в метод matches()
 *         \\ - переводя обычную букву спец символ или спец символ в обычную букву символ. Это нужно так как частно совпадают символы регулярных выражений и самого текста. Надо различать.
 *          \\d - описывает такой паттерн строки, в которой находится 1 цифра
 *          + - может 1 или более цифра или символ быть
 *          * - может 0 или более цифр или символов быть
 *          ? - может 0 или 1 символов до быть
 *          ( | | ) - может ИЛИ из множества строк
 *
 *          [] позволяют описать большие множества
 *          [a-zA-Z] все английские буквы
 *          [0-9] все возможные цифры
 *          пример: [abc] равняется по использованию с (a|b|c)
 *                  [0-9] равняется по использованию \\d
 *
 *           [^] этот символ означает отрицание. То есть наобот возвращать true если отстутствуют определенные указаные символы
 *           пример: [^abc] мы хотим чтобы были все символы кроме [abc]
 *                    [^a-z] мы хотим чтобы были все символы кроме маленьких английских букв
 *
 *           .  - обозначает любой символ
 *
 *          если мы хотим задать конкретное число символов или цифр
 *          {2} - 2 символа до пример: \\d{2}  то есть хотим видеть ровно 2 цифры
 *          {2,} - 2 или более символов пример: \\d{2,} хотим видеть от 2ух до беспонечности цифр
 *          {2, 4} - от 2ух до 4х символов пример: \\d{2,4}
 *
 *
 *          \\w - одна английская буква
 *          \\w = [a-zA-Z]
 *
 */
public class Test {
    public static void main(String[] args) {
        String a = "1234";
        String aa = "";
        System.out.println(a.matches("1234")); // true если строка совпадает с тем, что пришло в качестве аргумента
        System.out.println(a.matches("1235")); // false
        String b = "hello";
        System.out.println(b.matches("hello")); // true


        String c = "d";
        System.out.println(c.matches("\\d")); // false
        String d = "1";
        System.out.println(d.matches("\\d")); // true однако лишь одной цифре, при 12 уже будет false
        System.out.println(a.matches("\\d+")); // true тут мы описали такой случай, когда наша строко может содержать любое количество цифр
        System.out.println(aa.matches("\\d*")); // true
        String e = "-1241";
        System.out.println(e.matches("-\\d*")); // true
        System.out.println(e.matches("-?\\d*")); // true
        System.out.println(a.matches("-?\\d*")); // true
        String aaa = "+12124";
        System.out.println(aaa.matches("-?\\d*")); // false

        String b1 = "-12113412";
        String b2 = "121342";
        String b3 = "+45134142";
        /*
        покрывает все разобранные случай пример ниже
        (-|\\+) это перед ? воспринимается как один символ
        \\ перед + так как нам нужно отключить спец символ +, так как Java думает, что мы ставим спец символ
         */
        System.out.println(b1.matches("(-|\\+)?\\d*")); // true
        System.out.println(b2.matches("(-|\\+)?\\d*")); // true
        System.out.println(b3.matches("(-|\\+)?\\d*")); // true



        String f = "g12412"; // Задача: мы знаем что у нас может быть любое число, и обязательно одна буква латинского алфавита. Написать регулярное выражение.
        System.out.println(f.matches("[a-zA-Z]\\d+")); // true лишь одна буква
        String ff = "gfdFDGdFs12412";
        System.out.println(ff.matches("[a-zA-Z]\\d+")); // false
        System.out.println(ff.matches("[a-zA-Z]+\\d+")); // true
        String fff = "aasdf7adf1341";
        System.out.println(fff.matches("[a-zA-Z]+\\d+")); // false так как есть 1 цифра в буквах
        System.out.println(fff.matches("[a-zA-Z7]+\\d+")); // true
        String ffff = "asdsf1344433aFGHN124412";
        System.out.println(ffff.matches("[a-zA-Z134]+\\d+")); // true неважно сколько цифр, важно что сами цифры прописаны
        String f1 = "Fs5sf1347433aFGHN124412";
        System.out.println(f1.matches("[a-zA-Z0-9]+\\d+")); // true

        /*
        Опишем вариант НАОБОРОТ когда будут возвращаться TRUE если определнных цифр или букв НЕТ
        Важно! Все оставщиеся символы АВТОМАТИЧЕСКИ ВКЛЮЧАЮТСЯ В МНОЖЕСТВО!
         */
        String g = "asdf";
        System.out.println(g.matches("[^abc]*")); // false
        String g1 = "sdf";
        System.out.println(g1.matches("[^abc]*")); // true
        String g2 = "Hello";
        System.out.println(g2.matches("[^abc]*")); // true

        // Предпложим у нас есть адрес вебсайта и мы с помщью регулярных выражений будем определять он валидный или нет
        String url = "http://www.google.com";
        String url2 = "http://www.yandex.ru";
        String url3 = "Try you!";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)")); // true
        System.out.println(url2.matches("http://www\\..+\\.(com|ru)")); // true
        System.out.println(url3.matches("http://www\\..+\\.(com|ru)")); // false



        String h1 = "123";
        System.out.println(h1.matches("\\d{2}")); // false
        System.out.println(h1.matches("\\d{3}")); // true
        System.out.println(h1.matches("\\d{1,}")); // true
        System.out.println(h1.matches("\\d{1,3}")); // true


    }
}
