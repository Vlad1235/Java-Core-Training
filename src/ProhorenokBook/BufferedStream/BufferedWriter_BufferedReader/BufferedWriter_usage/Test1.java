package ProhorenokBook.BufferedStream.BufferedWriter_BufferedReader.BufferedWriter_usage;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * BufferedWriter(Writer out) - принимает объекты потока даннных
 * BufferedWriter(Writer out, int sz) - Указывается размер буфера, при достижении которого данные будут записаны в выходной поток.
 * С помощью метода flush() можно сбросить данные в выходной поток не дожидаясь заполнения буфера.
 * При использовании буфера важно закрывать поток явным образом!
 * Класс BufferedWriter наследует все методы из класса Writer, плюс добавляет newLine() метод
 * метод newLine() - выводит в поток разделитель строк в зависимости от использ операционной системы
 * Начиная с Java 7 для создания объекта класса BufferedWriter мы можем использовать статический метод newBufferedWriter() из класса Files.
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        /*
        Новое оформление конструкции обработки исключений без catch и finally
         */
        try(
            OutputStream out = new FileOutputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\BufferedStream\\BufferedWriter_BufferedReader\\forTest.txt");
            Writer writer = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter buf = new BufferedWriter(writer);
        ){
            buf.write("СтРоКа1");
            buf.newLine(); // выводим разделитель строк
            buf.write("строка2");
            buf.flush();
        }
    }
}
