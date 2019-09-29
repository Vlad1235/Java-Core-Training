package ProhorenokBook.String_about;

import java.util.Locale;

/**
 * Форматированный вывод, метод printf() класс PrintStream. Тотже эффект, но через метод String.format().
 *формула: %ИндексФлагШирина.ТочностьТиппреобразования
 */
public class Printf_string {
    public static void main(String[] args) {
        System.out.printf("'%10.2f'",10.5); //'     10.50'
        System.out.println();
        System.out.printf(new Locale("en","US"),"'%10.2f'",10.5); //'     10.50'
        System.out.println();
        System.out.println(String.format(new Locale("en", "US"),"'%10.2f'",10.5));
    }
}
/*
'     10.50'
'     10.50'
'     10.50'
 */