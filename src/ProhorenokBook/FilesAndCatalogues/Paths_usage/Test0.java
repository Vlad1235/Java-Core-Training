package ProhorenokBook.FilesAndCatalogues.Paths_usage;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Путь к файлам и каталогам можно описать с помощью классов File, Files и особенно Paths
 * метод get() - создает объект, реализующий интерфейс Path
 * public static Path get(String first, String ...more) - позволяет указать отдельные компоненты пути через запятую. Строки будут объедены через символ, используемый для разделения каталогов в ОС
 * public static Path get(URI uri) - создается путь на основе объекта класса Uri
 *
 * Путь можно создать на основе объекта класса File, вызвав метод toPath()
 */
public class Test0 {
    public static void main(String[] args) {
        Path p = Paths.get("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\FilesAndCatalogues\\Files_usage.txt");
        System.out.println(p.toString()); // C:\Users\Work\IdeaProjects\PolnoyePovtorenie\src\ProhorenokBook\FilesAndCatalogues\Files_usage.txt
        p = Paths.get("C","book","file.txt");
        System.out.println(p.toString()); // C\book\file.txt

        File f = new File("../file.txt");
        Path g = f.toPath();
        System.out.println(g.toString()); // ..\file.txt
    }
}
