package ProhorenokBook.FilesAndCatalogues.File_usage;

import java.io.File;

/**
 * Работа с дисками
 */
public class Test3 {
    public static void main(String[] args) {
        /*
        Возвращает массив с названиями всех дисков. listRoots(). Метод статический
         */
        File[] list = File.listRoots();
        for (File f: list) {
            System.out.println(f.toString() + " "); // C:\
        }

        /*
        Возвращает полный размер диска getTotalSpace()
        Возвращает количество свободного мества на диске getFreeSpace()
        Возвращает количество свободного места доступного для JVM. getUsableSpace()
         */
        File f = new File("C:\\");
        System.out.printf("%,d\n",f.getTotalSpace()); // 126,830,505,984
        System.out.printf("%,d\n",f.getFreeSpace()); // 68,712,083,456
        System.out.printf("%,d\n",f.getUsableSpace()); //68,712,083,456

    }
}
