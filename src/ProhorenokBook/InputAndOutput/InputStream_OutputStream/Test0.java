package ProhorenokBook.InputAndOutput.InputStream_OutputStream;

/**
 * Классы File и Files позволяют работать с файловой системой, то есть создавать, удалять,файлы и
 * целые каталоги, перемещать и копировать файлы, читать содержимое каталога и целого древа каталогов.
 * Однако НЕ РАССМАТИРОВАЛИ РАБОТУ С САМИМИ ФАЙЛАМИ, так как класс File не содержит методов для чтения и записи файлов.
 * Класс Files доступен с 7 версии Джава, он содержит методы для чтения и записи файлов, НО ПОЗВОЛЯЮТ ЧИТАТЬ ФАЙЛЫ ЦЕЛИКОМ. Если файл большого размера
 * то возможна ситуация, когда не хватит оперативной памяти. Гораздно эффективнее не читать файл целиком, а обрабатывать его по частям.
 *
 * Для чтения и записи файлов в Java используются ПОТОКИ.Объект, ИЗ КОТОРОГО МОЖНО СЧИТЫВАТЬ ДАННЫЕ НАЗЫВАЕТСЯ ПОТОКОМ ВВОДА.
 * Для объекта, В КОТОРЫЙ МОЖНО ЗАПИСЫВАТЬ ДАННЫЕ НАЗЫВАЕТСЯ ПОТОКОМ ВЫВОДА.
 * В качестве источника данных для объекта может быть не только файл, но и другие источники - массивы,сокеты,окно консоли.
 * Потоки ввода/вывода делятся на БАЙТОВЫЕ и СИМВОЛЬНЫЕ
 * БАЙТОВЫЕ - оперируют отдельными байтами и используются для чтения и записи двоичных данных.
 * Символьные - оперируют символами в различных кодировках и используются для чтения и записи текста.
 *
 * КЛассы байтовых потоков организованы в виде иерархии.Во главе находятся абстрактные классы -
 * InputStream(поток ввода) и
 * OutputStream(поток вывода)
 *
 *
 */
public class Test0 {
}
