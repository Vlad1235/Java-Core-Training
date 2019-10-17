package ProhorenokBook.StreamAPI;

import java.util.stream.IntStream;

/**
 * Создание потока из строки
 *
 * Создать поток символов из строки или из объекта, класс которого реализует интерфейс CharSequence, через методы chars(),codePoints()
 */
public class Test4 {
    public static void main(String[] args) {
        IntStream stream = "строка".chars();
        stream.forEachOrdered(x -> System.out.print((char)x)); // строка

        StringBuilder sb = new StringBuilder();
        sb.append("строка");
        IntStream stream1 = sb.chars();
        stream1.forEachOrdered(x-> System.out.print((char)x)); // строка

    }
}
