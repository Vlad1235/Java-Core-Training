package ProhorenokBook.InputAndOutput.InputStream_OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
        /**
        Класс OutputStream - базовый абстрактный для потоков вывода(записи)
        метод write() - записывает данные в поток
        метод flush() - сбрасывает данные из буфера в файл
        метод close() - сбрасывает данные из буфера в файл, закрывает поток и высвобождает ресурсы.
        метод getBytes() - преобразует строку в массив типа byte[], используя кодировку по умолчанию или указанную кодировку
        Все методы могут генерировать контролируемое исключение.

         FileOutputStream(String path, boolean n)
         Если необходимо добавить строки в файл, а не перезаписать его, то во втором параметре конструктора класс FileOutputStream нужно указать значение true
         */

public class Test1 {
    public static void main(String[] args) {
        OutputStream out = null;
        try {
            try {
                out = new FileOutputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\FilesAndCatalogues\\Files_usage"); // ошибка в пути файла
                byte[] bytes = "строка".getBytes("cp1251");
                out.write(bytes[0]);
                out.write(bytes, 0, 3);
                out.write(bytes);
            }
            finally {
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
        System.out.println("Данные успешно записаны в файл");
    }

}
/*
Не удалось записать в файл
 */
