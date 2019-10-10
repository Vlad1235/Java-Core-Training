package ProhorenokBook.FilesAndCatalogues.File_usage;

import java.io.File;
import java.io.IOException;

/**
 * Создаем экземпляр класса File
 */
public class Test1 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Work\\Desktop\\test.txt");
        System.out.println(f.getPath()); //C:\Users\Work\Desktop\test.txt

        File dir = new File("C:\\Users\\Work\\Desktop");
        File fn = new File(dir,"test.txt");
        System.out.println(fn.getPath()); //C:\Users\Work\Desktop\test.txt

        File fnn = new File("C:"  + File.separator + "Users"+File.separator+"Work"+File.separator+"Desktop"+File.separator+"test.txt");
        System.out.println(fnn.getPath()); //C:\Users\Work\Desktop\test.txt

    }

}
