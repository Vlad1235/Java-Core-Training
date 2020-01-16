package Stacktrace;

public class Stack {
    public static void main(String[] args) {
        System.out.println("Метод Main успешно запущен");
        m1();
        System.out.println("Метод Main заканчивает свою работу");
    }

    static void m1() {
        System.out.println("Первый метод передаёт привет!(m1)");
        m2();
        System.out.println("Первый метод завершается(m1)");
    }

    static void m2() {
        System.out.println("Второй метод передаёт привет(m2)");
    }
}
/*
Метод Main успешно запущен
Первый метод передаёт привет!(m1)
Второй метод передаёт привет(m2)
Первый метод завершается(m1)
Метод Main заканчивает свою работу
 */
