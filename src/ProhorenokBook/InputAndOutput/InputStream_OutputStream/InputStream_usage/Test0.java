package ProhorenokBook.InputAndOutput.InputStream_OutputStream.InputStream_usage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Абстрактый класс InputStream является базовым для байтовых потоков ввода (импортироваться данные из файла)
 *
 * Первый формат читает из потока один байт и возвращает его. Если достигнут конец потока то  метод вернет значение -1.
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
    }
}
