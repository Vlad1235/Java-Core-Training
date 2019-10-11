package ProhorenokBook.InputAndOutput.InputStream_OutputStream;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Создает поток на основе дескриптора существующего потока(объект класса FileDescriptor).
 * Вывести данные на консоль, а не в файл.
 *
 */
public class Test4 {
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream(FileDescriptor.out);
        byte[] bytes = "строка".getBytes("utf-8");
        out.write(bytes);
        out = null;
    }
}
/*
// из консоли
строка
 */