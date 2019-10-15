package ProhorenokBook.InputAndOutput.PrintWriter_PrintStream.PrintWriter_usage;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 *  * Класс PrintWriter наследует все методы класса Writer, реализует а также добавляет другие:
 *  * метод print() - оправляет в поток данные.
 *  * метод println() - отправляет данные в поток вывода и завершает текущую строку разделителем, исп в ОС
 *  метод printf() - предназначен для форматирования вводных данных
 * и др
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        try (
                OutputStream out = new FileOutputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\InputAndOutput\\PrintWriter_PrintStream\\PrintWriter_usage\\forPrintTest.txt");
                PrintWriter pw = new PrintWriter(out,true);
        )
        {
            /*
            любой тип данных принимает
             */
            pw.print(10);
            pw.print(' ');
            pw.print("строка");
        }

        try(
                OutputStream out = new FileOutputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\InputAndOutput\\PrintWriter_PrintStream\\PrintWriter_usage\\forPrintTest.txt",true);
                PrintWriter pw = new PrintWriter(out,true);
                )
        {
            pw.println(10); // 10
            pw.println(88.2); // 88.2
            pw.println('c'+'т'+"рока"); // 1189рока ВАЖНО!символы вместе с типом String не соединить!!!
        }

        try(
                OutputStream out = new FileOutputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\InputAndOutput\\PrintWriter_PrintStream\\PrintWriter_usage\\forPrintTest.txt",true);
                PrintWriter pw = new PrintWriter(out,true);
        )
        {
            pw.printf("%.2f",10.5125484); // 10.51
            pw.printf("%d %s",10,"строка"); //10 строка
        }

    }
}
