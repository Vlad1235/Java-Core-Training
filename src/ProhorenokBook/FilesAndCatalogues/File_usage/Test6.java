package ProhorenokBook.FilesAndCatalogues.File_usage;

import java.io.File;
import java.io.IOException;

/**
 * Права доступа к файлу или каталогу
 *  Права это:
 *  чтение
 *  запись
 *  выполнение
 *  Обозначаются буквами:
 *  r файл можно читать, содержимое каталога можно просматривать
 *  w файл можно модифицировать, удалять, переименовать, каталог можно создавать уделать файлы в нем.
 *  x файлы можно выполнять, а в каталоге можно выполнять операции над файлами, например поиск
 */
public class Test6 {
    public static void main(String[] args) throws IOException {
        /*
        canWrite() - возвращает true если в файл или каталог можно записать
        canRead() - возвращает true если файл или каталог доступен для чтения
        setReadable - устанавливает права на чтение. Возвращает true если права изменены
        setWritable - устанавливает права на запись. Возвращает true если права изменены
        Пример: сделаем файл доступным только для чтения и потом отменим
         */
        File file = new File("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\FilesAndCatalogues\\File_usage\\test2.txt");
        System.out.println(file.canWrite()); // true Можно записывать в него
        System.out.println(file.setWritable(false)); // true Отменили права на запись
        System.out.println(file.canWrite()); // false Нельзя записывать


        File newFile = new File("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\FilesAndCatalogues\\Files_usage.txt");
        boolean makeNewFIle = newFile.createNewFile();
        System.out.println(makeNewFIle); // false Так как я уже создал. Если бы в первый раз то было бы true

        File newFolder = new File("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\FilesAndCatalogues\\Files_usage");
        boolean makeNewFolder = newFolder.mkdirs();
        System.out.println(makeNewFolder); //true

    }
}
