package ProhorenokBook.InputAndOutput.Scanner_usage;

import java.util.Scanner;

/**
 * Класс Scanner содержит основные методы
 * методы nextBoolean(), nextByte(),nextShort(),nextInt(),nextLong(),nextFloat(),nextDouble() - получают данные элементарных типов
 * метод nextLine() - позволяет читать построчно
 * метод hasNext() - возвращает true если можно прочитать данные
 * метод close() - Обязательно закрывать поток!
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner("Строка 1\nстрока2\nстрока3");
        System.out.println(in.nextLine());
        System.out.println(in.nextLine());
        System.out.println(in.nextLine());
        in.close();
    }
}
/*
Строка 1
строка2
строка3
 */