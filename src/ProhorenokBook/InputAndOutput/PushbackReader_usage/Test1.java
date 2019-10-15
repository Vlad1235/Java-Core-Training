package ProhorenokBook.InputAndOutput.PushbackReader_usage;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Класс PushbackReader позволяет возвращать символы в поток ввода после прочтения, для последующего снова использования.
 *
 * Наследует все методы класса Reader
 * Содержит дополнительный метод unread(), который позволяет вернуть символы в поток. Эти символы будут доступны для следующей операции чтения
 * void unread(int c) throws IOException - возвращает в поток по символу
 * void unread(char[] cbuf, int off, int len) throws IOException - возвращает по len - символам начиная с позиции off
 * void unread(char[] cbuf) throws IOException - все символы из массива cbuf
 * Если буфер заполнен генерируется исключение
 *
 * Обратить внимание на комбинирование классов потоков. В примере создана цепочка из четырех классов потоков:
 * чтение из файла
 * чтение символов из потока в определенной кодировке
 * буферизация
 * возможность вернуть символы в поток
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        try (
                InputStream in = new FileInputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\InputAndOutput\\PushbackReader_usage\\TestPushback.txt");
                Reader reader = new InputStreamReader(in, Charset.forName("utf-8"));
                BufferedReader buf = new BufferedReader(reader);
                PushbackReader push = new PushbackReader(buf, 10);
        ) {
            char[] chars = new char[6];
            push.read(chars);
            for (int i = 0; i < chars.length; i++) {
                System.out.print(chars[i] + " ");
            }
            push.unread(chars); // возвращаем символы в поток
            push.read(chars);
            for (int i = 0; i < chars.length; i++) {
                System.out.print(chars[i] + " ");
            }
        }
    }
}
/*
" h e l l o " h e l l o
 */
