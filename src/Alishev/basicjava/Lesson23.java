package Alishev.basicjava;
/**
 * Java для начинающих. Урок 23: StringBuilder
 *
 * Важно. Все методы класса String не изменяют строку, с которой они вызываются, они ВОЗВРАЩИЮТ НОВУЮ СТРОКУ.
 * immutable object неизменяемые объекты.
 * Сколько бы раз мы не вызывали методы от сроки, оригинал ее х останется без изменения и будут каждый раз создаваться новые строки. Это затраты памяти!
 *
 * ПОЭТОМУ используется StringBuilder - он изменяемый
 */
public class Lesson23 {
    public static void main(String[] args) {
        String x ="hello";
      //  x.toUpperCase(); ошибка
        x = x.toUpperCase();
        System.out.println(x);

        /*
        Bag practice
         */
        String string1 = "Hello";
        String string2 = " my";
        String string3 = " friend";
        String stringall = string1+string2+string3;
        System.out.println(stringall);

        /*
        Good practice
         */
        StringBuilder sb = new StringBuilder("Hello"); // не нужно создавать новые объекты, сразу можно конкатенировать новые строки через метод append()
      //  sb.append(" my");
      //  sb.append(" friend");
        sb.append(" my").append(" friend"); // более красивый вариант с помощью methodchaining
        System.out.println(sb.toString());



    }
}
