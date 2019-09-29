package ProhorenokBook.OperatoryIcycles;

/**
 * Использовать разницу только если присваивать значение другой переменной y = x++, а если
 * просто x++ или ++x  то разницы нет.
 */
public class MyClass {
    public static void main(String[] args) {
        int x = 0, y = 0;
        x = 5;
        y = x++;
        System.out.println("Постфиксная форма (y = x++):");
        System.out.println("y = " + y);
        System.out.println("x = " + x);
        x = 5;
        y = ++x;
        System.out.println("Префиксная форма (y = ++x):");
        System.out.println("y = " + y);
        System.out.println("x = " + x);
    }
}
/*
Постфиксная форма (y = x++):
y = 5
x = 6
Префиксная форма (y = ++x):
y = 6
x = 6

* */