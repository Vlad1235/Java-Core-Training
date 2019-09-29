package ProhorenokBook.Numbers.StrokaVChislo;

/**
 * Преобразование строки В ЧИСЛО. Метод parseInt(строка, система счисления).
 * Другие типы Short,Byte,Long,Float,Double - тот же принцип.
 */
public class ToNumber {
    public static void main(String[] args) {
        int x;
        x = Integer.parseInt("119",10);
        System.out.println(x);
    }
}
/*
119
*/
