package ProhorenokBook.String_about;

/**
 * Продолжение применения метода printf().
 * формула:
 * %ИндексФлагШирина.ТочностьТиппреобразования
 */
public class Printf2_string {
    public static void main(String[] args) {
        System.out.printf("Просто строка" + " тоже строка"); //Просто строка тоже строка
        System.out.println();
        System.out.printf("%d %s", 10, "руб."); // d- вывод десятичного числа, s - вывод строки или другого, ктр будет преобразован в строку.
        System.out.println();
        System.out.printf("%2$s %1$d руб.", 10, "цена"); // поменять местами (присвоение индексов)
        System.out.println();
        System.out.printf("%b %b", true, false); // вывод логического выражения
        System.out.println();
        System.out.printf("%c", 'w'); // вывод символа
        System.out.println();
        System.out.printf("%f %f", 18.6578442, 12.5);  // вывод вещественного числа


    }
}
/*
Просто строка тоже строка
10 руб.
цена 10 руб.
true false
w
18.657844 12.500000
 */