package ProhorenokBook.String_about;

import java.nio.charset.Charset;

/**
 * Преобразовать массив байтов и массив символов в строку через использование конструктора класса String.
 */
public class StringConstructor_array {
    public static void main(String[] args) {
        byte[] arr = {-47,-126,-48,-75,-47,-127,-47,-126};
        String s = new String(arr, Charset.forName("utf-8")); // выбор кодировки.
        System.out.println(s);
        s = new String(arr, Charset.defaultCharset()); // выбор кодировки по умолчанию (UTF-8)
        System.out.println(s);
        s = new String(arr, Charset.forName("cp1251")); // выбор кодировки windows-1251
        System.out.println(s+"\n");
        char[] arr2 = {'f','u','c','k','e','r'};
        String n = new String(arr2); // передача массива напрямую в конструктор
        System.out.println(n);

    }
}
/*
тест
тест
С‚РµСЃС‚

fucker
 */