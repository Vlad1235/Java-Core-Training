package ProhorenokBook.InputAndOutput.PrintWriter_PrintStream.PrintWriter_usage;

import java.io.*;
import java.nio.charset.Charset;

/**
 * 9 типов конструкторов у класса PrintWriter. Наиболее часто используемые
 * PrintWriter(String fileName, String csn) - принимают путь к файлу и кодировку. Если файл не существует, то создастся, если сущ то перезаписан.
 * PrintWriter(File file, Charset csn) - второй параметр кодировка. Если не указана, то кодировка по умолчанию (НЕ ДЕЛАТЬ ТАК, ИНАЧЕ ПРОБЛЕМЫ!!) Лучше самому указать кодировку.
 *
 * PrintWriter(OutputStream out, boolean autoFlush, Charset csn) - Если параметр autoFlush указан true, то вызов методов println(),printf(),format() - будет приводить к автоматическому сбросу буфера.
 * и др конструкторы.
 *
 * Класс PrintWriter наследует все методы класса Writer, реализует а также добавляет другие:
 * метод print() - оправляет в поток данные.
 * метод println() - отправляет данные в поток вывода и завершает текущую строку разделителем, исп в ОС
 *
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        try(
                PrintWriter pw = new PrintWriter("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\InputAndOutput\\PrintWriter_PrintStream\\forTest.txt");
                )
        {
            pw.println("Строка 1 способ 1");
        }

        try(
                OutputStream out = new FileOutputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\InputAndOutput\\PrintWriter_PrintStream\\forTest.txt",true);
                PrintWriter pw = new PrintWriter(out,true, Charset.forName("utf-8"));
                )
        {
            pw.println("Строка 2 способ 2");
        }

        try (
            OutputStream out = new FileOutputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\InputAndOutput\\PrintWriter_PrintStream\\forTest.txt",true);
            Writer writer = new OutputStreamWriter(out,"utf-8");
            PrintWriter pw = new PrintWriter(writer,true);
        ) {
            pw.println("Строка 3 способ 3");
        }


    }
}
