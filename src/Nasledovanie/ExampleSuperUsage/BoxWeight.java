package Nasledovanie.ExampleSuperUsage;

/**
 * В приведенном  примере метод super ( ) вызывался с тремя аргументами.
 * Конструкторы могут быть перегружаемыми , и поэтому метод super ( ) можно вызывать,
 * используя любую форму, определяемую в суперклассе. Выполнен будет тот
 * конструктор, который соответствует указанным аргументам.
 */

public class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m){
        super(w,h,d); // вызвать конструктор суперкласса.
        weight = m;
    }



}
