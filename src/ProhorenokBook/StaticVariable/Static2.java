package ProhorenokBook.StaticVariable;
/**
 * Область видимости. Влияет каждая инициализация на переменную
 */
public class Static2 {

    static int x;

    static void func(){
        x = 30;
        System.out.println(x);
        System.out.println(Static2.x);
        Static2.x = 88; // x=88; тоже самое
    }

    public static void main(String[] args) {
        x = 10;
        System.out.println(x);
        func();                 // вызов метода func()
        System.out.println(x);
    }
}
/*
10
30
30
88
* */