package ProhorenokBook.BufferedStream.BufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * BufferedOutputStream(OutputStream out)
 * BufferedOutputStream(OutputStream out, int size)
 * Конструкторы в первом параметре принимают объект потока вывода.
 * Второй конструктор позволяет указать размер буфера, при достижении которого данные будут записаны в выходной поток.
 * С помощью метода flush() можно сбросить данные в выходной поток, не дожидаясь заполнения буфера.
 * При использовании буфера важно закрыть поток явным образом, иначе данные так и будут оставться в буфере.
 * Класс BufferedOutputStream наследует все методы из класса OutputStream и реализует их.
 */
public class test1 {
    public static void main(String[] args) throws IOException {
        OutputStream out = null;
        BufferedOutputStream buf = null;

        try{
            out = new FileOutputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\BufferedStream\\BufferedOutputStream\\BufferedOutputStreamTest.txt"); // автоматом создает файл если его нет.
            buf = new BufferedOutputStream(out);

            byte[] bytes = "строка строка строка".getBytes("cp1251");
            buf.write(bytes);
            buf.flush();
        } finally {
            if(buf != null) buf.close();
        }
    }
}
