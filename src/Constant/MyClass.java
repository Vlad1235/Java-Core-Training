package Constant;

import java.util.Calendar;

/**
 * Создание констант внутри класса
 */
public class MyClass {
    public static void main(String[] args) {
        // Обратиться можно без создания экземпляра
        System.out.println(Class1.PI);  // 3.14
        Class1 c = new Class1(10);
        // Только через экземпляр класса
        System.out.println(c.MY_CONST); // 10
        Class1 d = new Class1(20);
        System.out.println(d.MY_CONST); // 20
        Class1 e = new Class1(30);
        System.out.println(e.MY_CONST); // 30
        System.out.println(c.MY_CONST); // 10
        System.out.println(d.MY_CONST); // 20
        System.out.println(e.MY_CONST); // 30
    }
}
/*
3.14
10
20
30
10
20
30
 */