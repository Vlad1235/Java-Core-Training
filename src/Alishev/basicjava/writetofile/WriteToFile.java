package Alishev.basicjava.writetofile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Java для начинающих. Урок 44: Запись в файл.
 * Запись только стрококовых значений. НЕ ОБЪЕКТОВ
 */
public class WriteToFile {
    public static void main(String[] args) throws MyOwnException {
        File file = new File("C:\\Projects\\MyTraining\\src\\Alishev\\basicjava\\writetofile\\Testfile.txt"); // можем не указывать полный путь до файла, так как он лежит в дериктории проекта(но не в нашей директории). Если файла нет, он будет создан.
        try {
            PrintWriter printWriter = new PrintWriter(file); // запись только типа String значений
            printWriter.println("Test row one");
            printWriter.println("Test row two");
            printWriter.println("23 35");
            printWriter.close();
        } catch (FileNotFoundException e) {
            throw new MyOwnException("Файл не правильно положен в директорию");
        }


    }
}
