package ProhorenokBook.InputAndOutput.InputStream_OutputStream.InputStream_usage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/**
 * Чтение из файла в кодировке windows-1251
 */
public class Test2 {
    public static void main(String[] args) {
        /*
        Чтение из файла с обработкой искючений.
         */
        InputStream in = null;
        try {
            try {
                in = new FileInputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ForTestReadingFrom.txt");
                byte[] buffer = new byte[in.available()];
                in.read(buffer);
                String s = new String(buffer, "cp1251");
                System.out.print(s);
            } finally {
                if (in != null) in.close();
            }
        } catch (UnsupportedEncodingException e) {
            System.err.println("Проблемы с кодировкой");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Не удалось прочитать файл");
            System.exit(1);
        }

    }
}
/*
This information for test only. Bla Bla Bla.
 */