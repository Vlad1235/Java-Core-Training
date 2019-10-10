package ProhorenokBook.FilesAndCatalogues.File_usage;

import java.io.File;
import java.io.IOException;

/**
 * * Работа с файлами
 */
public class Test5 {
    public static void main(String[] args) throws IOException {
        /*
        createNewFile() - создает новый файл, если он не существует. Возвращает true если он создан

         */
        File file = new File("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\FilesAndCatalogues\\File_usage\\test2.txt");
        System.out.println(file.createNewFile()); // true ФАйл создан!
        /*
        exists() - Возвращает true если файл существует
         */
        System.out.println(file.exists()); // true
    }
}
