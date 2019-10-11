package ProhorenokBook.FilesAndCatalogues.File_usage;

import java.io.File;
import java.io.IOException;

/**
 * * Работа с файлами
 */
public class Test5 {
    public static void main(String[] args) throws IOException, InterruptedException {
        /*
        createNewFile() - создает новый файл, если он не существует. Возвращает true если он создан

         */
        File file = new File("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\FilesAndCatalogues\\File_usage\\test2.txt");
        System.out.println(file.createNewFile()); // true ФАйл создан!
        /*
        exists() - Возвращает true если файл существует
         */
        System.out.println(file.exists()); // true

        /*
        deleteOnExit() - Удаляет файл или каталог по завершении работы программы.
         */
        File dir = new File("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\FilesAndCatalogues\\File_usage\\");
        File tempFile = File.createTempFile("del",null,dir);
        System.out.println(tempFile); //C:\Users\Work\IdeaProjects\PolnoyePovtorenie\src\ProhorenokBook\FilesAndCatalogues\File_usage\del15662684210748156067.tmp
        tempFile.deleteOnExit();
        Thread.sleep(10000); // засыпаем на 10 сек
        System.out.println("exit");

        /*
        length() - возвращаем размер файла
         */
        File file0 = new File("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\FilesAndCatalogues\\File_usage\\test2.txt");
        System.out.println(file0.length()); //0
    }
}
