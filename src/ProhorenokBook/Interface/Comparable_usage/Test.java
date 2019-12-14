package ProhorenokBook.Interface.Comparable_usage;

/**
 * Интерфейс Comparable</T>
 * Используется если нужно знать не только равны ли объекты, но и больше или меньше они друг друга. Эта инфа пригодится
 * для сортировки. Внутри интерфейса метод compareTo(T other)
 * Метод НЕ ОБЯЗАН возвращать только числа -1 или 1 (про 0 понятно что обязательно). Допустимо любое другое значение, ВАЖЕН ЛИШЬ ЗНАК ЧИСЛА
 */
public class Test {
    public static void main(String[] args) {
        A obj1 = new A(10);
        A obj2 = new A(10);
        A obj3 = new A(3);
        A obj4 = new A(15);
        System.out.println(obj1.compareTo(obj2));
        System.out.println(obj1.equals(obj2)); // потому что метод не переопределен. Поэтому false
        System.out.println(obj1.compareTo(obj3));
        System.out.println(obj1.compareTo(obj4));
        System.out.println(obj4.compareTo(obj1));
    }
}
/*
0
false
1
-1
1
 */