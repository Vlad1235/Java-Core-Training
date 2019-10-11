package ProhorenokBook.InputAndOutput.InputStream_OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/**
 * В конструкторе класса FileOutputStream(String name, boolean append), если пераметр append равен true, то данные будут
 * записаны в конец файла без удаления существующих данных, если false  то будут перезаписан полностью.
 * Если указанного файла не существует он будет создан.
 */
public class Test3 {
    public static void main(String[] args) {
        OutputStream out = null;
        try {
            try {
                out = new FileOutputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\InputAndOutput\\InputStream_OutputStream\\testingFile.txt",true);
                byte[] bytes = "\nстолбец и строка".getBytes("cp1251");
                out.write(bytes);
            } finally {
                if (out != null) out.close();
            }
        }
        catch (UnsupportedEncodingException e) {
            System.err.println("Проблемы с кодировкой");
            System.exit(1);
        }
        catch (IOException e) {
            System.err.println("Не удалось записать в файл");
            System.exit(1);
        }
    }
}
/*
// из файла testingFile.txt
столбецстолбец и строка
столбец и строка
 */