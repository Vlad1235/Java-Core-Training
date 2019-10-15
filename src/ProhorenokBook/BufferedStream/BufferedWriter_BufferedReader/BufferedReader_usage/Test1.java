package ProhorenokBook.BufferedStream.BufferedWriter_BufferedReader.BufferedReader_usage;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * BufferedReader(Reader in)
 * BufferedReader(Reader in, int size)
 * Класс BufferedReader наследует все методы из класса Reader, реализует их и добавляет еще методы:
 * метод readLine() - читать из потока по одной строке. Если строк больше нет, то возвращает значение null
 * метод lines() - возвращает поток Stream<String>, с помощью которого можно читать данные построчно. Начиная с Java 8 доступен.
 *
 * Статический метод newBufferedReader() из класса Files. Начиная с Java 7 для создания объектов класса BufferedReader
 * public static BufferedReader new BufferedReader(Path path, Charset cs) throws IOException - первый путь, второй кодировка.По умолчанию UTF-8
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        try (
                InputStream in = new FileInputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\BufferedStream\\BufferedWriter_BufferedReader\\forTest.txt");
                Reader reader = new InputStreamReader(in, StandardCharsets.UTF_8); // Важно выбирать ту же кодировку, в которой записывался текст.
                BufferedReader buf = new BufferedReader(reader);
        ) {
                String line = "";
                while ((line = buf.readLine()) !=null){
                    System.out.println(line);
                }
        }
    }
}
/*
СтРоКа1
строка2
НОВАЯ строка добавлена другим способом
 */