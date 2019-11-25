package Alishev.basicjava.exceptions;

import java.io.IOException;
import java.util.Scanner;

/**
 * Java для начинающих. Урок 38: Исключения (часть 2). Выбрасывание исключений.
 * <p>
 * Пользователь должен ввести 0 в консоли и если он тупит и не вводит что нужно, выбрасываем исключение
 */
public class Exceptions2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0) {
                    throw new ScannerException("Пользователь ввел что-то кроме ноля"); // мы его создали сами
            }
        }
    }
}
/*
Exception in thread "main" Alishev.basicjava.exceptions.ScannerException: Пользователь ввел что-то кроме ноля
	at Alishev.basicjava.exceptions.Exceptions2.main(Exceptions2.java:17)
 */