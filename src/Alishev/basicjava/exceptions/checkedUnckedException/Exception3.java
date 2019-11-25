package Alishev.basicjava.exceptions.checkedUnckedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        // Checked exception (Compile time exception) возникают во время компиляции. Без обработки такого типа исключений программа не скомпилируется. Это например файл не найден в указанной нами директории.
        // Unchecked exception (Runtime exception) возникают во время выполнения программы. Ошибки типа ДЕЛЕНИЯ НА НОЛЬ! Программа скомпилируется и запустится, но исход не ясен. ЭТО ОШИБКИ ТУПОСТИ. Их не обрабатывают их убирают

        /*
        Пример Compile time исключения (требует обработки)
         */
        File file = new File("File.txt");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        }

        /*
        пример Runtime исключения
         */
        String name = null;
        name.length();
        //Exception in thread "main" java.lang.NullPointerException
        //	at Alishev.basicjava.exceptions.checkedUnckedException.Exception3.main(Exception3.java:12)

        /*
        Еще пример Runtime исключения
         */
        int[] arr = new int[2];
        System.out.println(arr[2]);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
        //	at Alishev.basicjava.exceptions.checkedUnckedException.Exception3.main(Exception3.java:20)
    }
}
