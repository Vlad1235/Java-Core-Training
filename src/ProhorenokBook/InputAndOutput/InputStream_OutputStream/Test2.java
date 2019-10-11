package ProhorenokBook.InputAndOutput.InputStream_OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Класс FileOutputStream - является реализацией абстрактного класса OutputStream и позволяет записывать данные в файл
 * Обазательно обработать или пробросить исключение
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        OutputStream out = null;

        try{
            out = new FileOutputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\InputAndOutput\\InputStream_OutputStream\\testingFile.txt");
            byte[] bytes = "строка".getBytes("cp1251");
            out.write(bytes);
        }
        finally {
            if(out != null) out.close();
        }
    }
}
/*
// файл создан и в том же каталоге
 */