package ProhorenokBook.FilesAndCatalogues.File_usage;

import java.io.File;
import java.io.IOException;

/**
 * Путь к файлу или каталогу может быть абсолютным или относительным.
 * Абсолютный - задается название диска и путь к файлу или каталогу.
 * Относительный - путь определеляется с учетом местоположения текущего рабочего каталога
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        /*
        Если файл находится в текущем рабочем каталоге, то можно указать только название файла.
         */
        File ff = new File("test.txt");
        System.out.println(ff.getCanonicalPath()); //  C:\Users\Work\IdeaProjects\PolnoyePovtorenie\test.txt

        /*
        Если файл расположен во вложенной папке, то перед названием файла указывается названия вложенных папок через слеш
         */
        File fff = new File("File_usage/test.txt");
        System.out.println(fff.getCanonicalPath()); // C:\Users\Work\IdeaProjects\PolnoyePovtorenie\File_usage\test.txt

        File ffff = new File("../test.txt");
        System.out.println(ffff.getPath()); //..\test.txt
        System.out.println(ffff.getCanonicalPath()); // C:\Users\Work\IdeaProjects\test.txt
        System.out.println(ffff.getAbsolutePath()); // C:\Users\Work\IdeaProjects\PolnoyePovtorenie\..\test.txt

    }
}
