package Alishev.basicjava;

import java.util.Scanner;

/**
 * Урок 7: Ввод данных. Класс Scanner
 */
public class Lesson7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // МОЖНО передать и не только инфу с консоли, но даже и из файла.
        System.out.println("Введите какое-нибудь число");
        int x = s.nextInt();
        System.out.println("вы ввели " + x);
    }
}
