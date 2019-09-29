package ProhorenokBook.StaticVariable;
/**
 * Область видимости. Если внутри метода инициирована, то она не повлияет на переменную экземпляра( глобальную переменную).
 */
public class Static3 {

    static int x;

    static void func(){
        int x = 30; // объявленная и инициализированная локальная переменная.
        System.out.println(x); //30
        Static3.x = 88;
        System.out.println(Static3.x);
    }

    public static void main(String[] args) {
        int x = 10;// объявленная и инициализированная локальная переменная.
        System.out.println(x);
        System.out.println(Static3.x); // глобальная переменная.
        func();                 // вызов метода func()
        System.out.println(x);
    }
}
/*
10
0
30
80
10

* */