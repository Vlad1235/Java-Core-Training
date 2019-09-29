package Constant.BadMove;

/**
 * Опасность простого указания как static
 */
public class MyClass {
    public static void main(String[] args) {
        // Обратиться можно без создания экземпляра
        System.out.println(Class1.PI);  // 3.14
        Class1 c = new Class1(10);
        // Только через экземпляр класса
        System.out.println(c.My_Static); // 10
        Class1 d = new Class1(20);
        System.out.println(d.My_Static); // 20
        Class1 e = new Class1(30);
        System.out.println(e.My_Static); // 30
        System.out.println(c.My_Static); // 30
        System.out.println(d.My_Static); // 30
        System.out.println(e.My_Static); // 30
    }
}
/*
3.14
10
20
30
30
30
30
 */