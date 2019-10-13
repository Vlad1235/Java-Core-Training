package ProhorenokBook.InputAndOutput.InputStream_OutputStream.InputStream_usage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Абстрактый класс InputStream является базовым для байтовых потоков ввода (импортироваться данные из файла)
 * read() - читает данные из потока.
 * Второй формат читает из потока len байтов и записывает их в массив b, начиная с индекса off
 * public int read(byte[] b, int off, int len)
 * Первый формат читает из потока один байт и возвращает его. Если достигнут конец потока то  метод вернет значение -1.
 * public int read(byte[] b)
 */
public class Test0 {
    public static void main(String[] args) throws IOException {
        /*
        Пример чтения файла по одному байту.
         */
        byte[] bytes = "string".getBytes();
        Files.write(Paths.get("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\InputAndOutput\\InputStream_OutputStream\\testingFile.txt"),bytes);
        InputStream in = null;
        try{
            in = new FileInputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\InputAndOutput\\InputStream_OutputStream\\testingFile.txt");
            int c;
            while ((c = in.read()) !=-1);
            System.out.println((char)c + " ");
        } finally {
            if(in != null) in.close();
        }

        /*
        Чтение файла по байтам.
         */
        byte[] buffer = new byte[5];
        InputStream inn = null;
        try{
            inn = new FileInputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ForTestReadingFrom.txt");
            int n;
            while ((n = inn.read(buffer,0,1)) != -1){
                for (int i = 0;i<n;i++){
                    System.out.print((char) buffer[i] + " ");
                }
            }
        }
        finally {
            if(inn != null) inn.close();
        }

    }
}
/*
￿
T h i s   i n f o r m a t i o n   f o r   t e s t   o n l y .   B l a   B l a   B l a .
 */