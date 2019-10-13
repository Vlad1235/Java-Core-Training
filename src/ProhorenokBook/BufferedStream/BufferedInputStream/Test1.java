package ProhorenokBook.BufferedStream.BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * BufferedInputStream(InputStream out)
 * BufferedInputStream(InputStream out, int size)
 * Конструкторы в первом параметре принимают объект потока ввода.
 * Второй конструктор позволяет указать размер буфера
 * */
public class Test1 {
    public static void main(String[] args) throws IOException {
        InputStream in = null;
        BufferedInputStream buf = null;

        try{
            /*
            Первые две строки - это для записи в файл. Также можно использовать
             */
            byte[] bytes = "string1212\nstring2121".getBytes();
            Files.write(Paths.get("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\BufferedStream\\BufferedInputStream\\BufferedInputStreamTest.txt"),bytes);
            in = new FileInputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\BufferedStream\\BufferedInputStream\\BufferedInputStreamTest.txt");
            buf = new BufferedInputStream(in);
        } finally {
            if(buf !=null) buf.close();
        }
    }
}
/*
// в ФАЙЛЕ BufferedInputStreamTest.txt ПОЯВИЛИСЬ
string1212
string2121
 */