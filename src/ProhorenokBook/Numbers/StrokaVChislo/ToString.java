package ProhorenokBook.Numbers.StrokaVChislo;

/**
 * 3 способа преобразовать в строку
 * конкатенация
 * метод valueOf()
 * метод toString()
 */
public class ToString {
    public static void main(String[] args) {
        int x = 100;
        double y = 1.5;
        String z = "x = " + x + " y = " + y; // 1 способ (этот способ как раз и работает в System.out.println()
        System.out.println(z);
        int h = 100;
        String s = String.valueOf(h); // 2 способ
        System.out.println(s);
        String j = Integer.toString(h,10); //3 способ
        System.out.println(j);
    }
}
/*
x = 100 y = 1.5
100
100
 */