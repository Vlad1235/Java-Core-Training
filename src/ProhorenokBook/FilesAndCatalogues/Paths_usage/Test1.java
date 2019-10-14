package ProhorenokBook.FilesAndCatalogues.Paths_usage;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Интерфейс Path содержит следующие базовые методы:
 * метод toString() - возвращает текстовое представление объекта.
 * метод toAbsolutePath() - возвращает абсолютный путь
 * метод getFileName() - возвращает имя файла или каталога
 * метод equals() - возвращает значение true, если два объекта пути являются одинаковыми
 * метод compareTo() - сравнивает два объекта пути. Если идентичны то возвращает 0, или -1 если нет
 */
public class Test1 {
    public static void main(String[] args) {
        Path p = Paths.get("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\FilesAndCatalogues\\Files_usage.txt");
        System.out.println(p.toString()); // C:\Users\Work\IdeaProjects\PolnoyePovtorenie\src\ProhorenokBook\FilesAndCatalogues\Files_usage.txt
        System.out.println(p.toAbsolutePath()); //C:\Users\Work\IdeaProjects\PolnoyePovtorenie\src\ProhorenokBook\FilesAndCatalogues\Files_usage.txt
        System.out.println(p.getFileName()); // Files_usage.txt

        Path p1 = Paths.get("C","ProgramFiles","folder");
        Path p2 = Paths.get("C","ProgramFiles","folder");
        boolean trueFalse = p1.equals(p2);
        System.out.println(trueFalse); // true

        Path p3 = Paths.get("C","ProgramFiles","folder2");

        System.out.println(p1.compareTo(p2)); //0
        System.out.println(p2.compareTo(p3)); // -1

    }
}
