package ProhorenokBook.StaticVariable;

/**
 * Статические переменные и константы класса.
 */
public class Static1 {
    static int x; // так как указан статик, то автоматически инициализирована как 0.
    static final int MY_CONST = 50; // не получится изменить, так как файнал.

    public static void main(String[] args) {
        System.out.println(x); //0
        x=10; // можно и тут переинициализировать, так как переменная статичная
        System.out.println(x); // 10
        Static1.x = 88; // статичнаую переменную можно и так вызвать и проинициализировать
        System.out.println(x); // 88
        System.out.println(Static1.x); // 88
        System.out.println(MY_CONST); // 50
        System.out.println(Static1.MY_CONST); // 50
    }
}
/*
0
10
88
88
50
50
* */