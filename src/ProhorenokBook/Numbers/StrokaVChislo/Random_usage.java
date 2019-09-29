package ProhorenokBook.Numbers.StrokaVChislo;

import java.util.Random;

/**
 * Использование конструктора класса позволяет получить одно и тоже значение для обоих экземпляров, если передать одинаковое
 * значение - можно использовать для синхронизации.
 */
public class Random_usage {
    public static void main(String[] args) {
        Random r1 = new Random(1);
        Random r2 = new Random(1);
        System.out.println(r1.nextDouble());
        System.out.println(r2.nextDouble()+ "\n");

        Random r = new Random();
        System.out.println(r.nextInt(5)+ "\n"); // случайное число в формате int в границах до 5(не вкл)

        Random r3 = new Random();
        System.out.println(r3.nextLong()); //случайное число в формате long
    }
}
/*
0.7308781907032909
0.7308781907032909

2

656663526404362586
 */
