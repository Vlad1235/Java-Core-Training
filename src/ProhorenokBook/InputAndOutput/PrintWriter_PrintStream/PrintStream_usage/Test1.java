package ProhorenokBook.InputAndOutput.PrintWriter_PrintStream.PrintStream_usage;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Класс PrintStream наследует и реализует все методы из класса OutputStream, а также реализует
 * все форматы метода append() - то есть возвращают объекты класса PrintStream из интерфейса Appendable.
 * Класс PrintStream содержит все методы из класса Writer, но форматы метода write() работают с байтами, а не символами.
 * Класс PrintStream дополнительно содержит методы print(), println(),printf(),format(),checkError() - которые аналогичны методам из класса PrintWriter
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        try(
                OutputStream out = new FileOutputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\InputAndOutput\\PrintWriter_PrintStream\\forTest.txt",true);
                PrintStream pw = new PrintStream(out,true, Charset.forName("utf-8"));
                )
        {
            pw.println("СТРОКА_ДРУГАЯ");
            pw.println("СТРОКА!!!!!!");
        }
    }
}
