package ProhorenokBook;

/**
 * VAR можно использовать ТОЛЬКО для объявления ЛОКАЛЬНОЙ ПЕРЕМЕННОЙ любого типа. Начиная с JAVA 10
 */
public class VARvariable {
    public static void main(String[] args) {
        var a = "hello world";
        var b = 12345;
        var c = 10.5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
/*
hello world
12345
10.5
 */