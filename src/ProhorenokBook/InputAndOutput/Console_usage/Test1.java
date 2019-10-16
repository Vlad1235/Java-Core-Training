package ProhorenokBook.InputAndOutput.Console_usage;

import Input.ConsoleInput;

import java.io.Console;
import java.util.Scanner;

/**
 * Класс Console основные методы:
 * printf(), format() - для форматирования вывода данных
 * writer() - возвращает объект класа PrintWriter, с помощью которого можно выводить данные на консоль
 * flush() - сбрасывать данные из буфера
 * readLine() - читать строку из консоли и возвращать ее
 * reader() - возвращает объект класса Reader, с помощью которого можно вводить данные с консоли
 * readPassword() - позволяет ввести пароль без отображения символов в окне консоли.В целях безопасности пароль возвращается в виде символьного массива и после прочтения пароля перезаписывается массив.
 */
public class Test1 {
    public static void main(String[] args) throws NullPointerException {
        Console cons  = System.console();
        if (cons != null){
            cons.printf("%d %s", 20, "Текст");
            cons.format("%.2f%n",12.45464);
        }

        cons.writer().println(200);

        Console cons2 = System.console();
        if (cons2 != null) {
            String line = cons2.readLine("%s","Введите данные: ");
            cons2.writer().println(line);
        }

        Console cons3 = System.console();
        if (cons3 != null){
            cons3.printf("%s","Введите данные: ");
            Scanner in = new Scanner(cons3.reader());
            String line = in.nextLine();
            cons3.writer().println(line);
        }

    }
}
