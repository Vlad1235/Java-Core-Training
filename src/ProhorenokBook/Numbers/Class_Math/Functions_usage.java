package ProhorenokBook.Numbers.Class_Math;

/**
 * Подавляющее большинство функция класса Math
 */
public class Functions_usage {
    public static final double PI = Math.PI; // 3.14......
    public static final double E = Math.E; // 2.71.....

    public static void main(String[] args) {
        System.out.println(Math.abs(-1)); // возвращает абсолютное значение.
        System.out.println(Math.pow(10,2)); // возводит число 1 в степень числа 2. Все априрои в формате double.
        System.out.println(Math.pow(10.0,2.0)); // возводит число 1 в степень числа 2.
        System.out.println(Math.sqrt(100.0)); // квадратный корень, неважно число вещественное или целое.
        System.out.println(Math.exp(3));
        System.out.println(Math.log(4));
        System.out.println(Math.IEEEremainder(13.5,2.0)); // способ подсчета остатка от деления. Используется другой принцип вычисления, чем у оператора %
        System.out.println(13.5%2.0);
        System.out.println(Math.max(14,15)); // max значение.
        System.out.println(Math.min(14,15));// min значение.
        System.out.println(Math.ceil(1.49)); // округление до близжайшего большего значения. Возвращает тип double.
        System.out.println(Math.ceil(1.5));
        System.out.println(Math.ceil(1.51));
        System.out.println(Math.floor(1.29)); //округление до близжайшего меньшего значения. Возвращает тип double.
        System.out.println(Math.floor(1.5));
        System.out.println(Math.floor(1.51));
        System.out.println(Math.round(1.49)); // округлене в зависимости по какую сторону от 0.5
        System.out.println(Math.round(1.5));
        System.out.println(Math.round(1.51));
        System.out.println(Math.sin(Math.toRadians(90.0))); // Вычисление угла. Он задается в радианах, также функция класса Math.
        System.out.println(Math.cos(90.0));
        System.out.println(Math.toRadians(180.0)); // Преобразует градусы в радианы.
        System.out.println(Math.toDegrees(PI)); // преобразует радианы в градусы.
    }
}
/*
1
100.0
100.0
10.0
20.085536923187668
1.3862943611198906
-0.5
1.5
15
14
2.0
2.0
2.0
1.0
1.0
1.0
1
2
2
1.0
-0.4480736161291701
3.141592653589793
180.0
* */