package ProhorenokBook.FilesAndCatalogues;

import java.io.File;
import java.nio.file.Files;

/**
 * Для работы с файловой системой в Java предназначены классы:
 * File (java.io.File)
 * Files (java.nio.file.Files) (Появился с Java 7 дополнительно позволяет писать и читать, копировать и перемещать файлы
 * Они содержат базовые методы ДОСТУПА К ФАЙЛАМ и КАТАЛОГАМ, но не содержат методов для чтения и записи (для  этого применяются потоки)
 Активно используются исключения
 Класс File  содержит несколько статических констант:
 separator - символ, разделяющий именя каталогов
 pathSeparator - символ, разделяющий несколько путей

 */
public class Test0 {
    public static void main(String[] args) {
        System.out.println(File.separator); // \
        System.out.println(File.pathSeparator); // ;
    }
}
