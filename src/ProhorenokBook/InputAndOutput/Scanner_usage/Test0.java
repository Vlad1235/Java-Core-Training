package ProhorenokBook.InputAndOutput.Scanner_usage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Для чтения данных из потока можно воспользоваться  классом Scanner.
 *
 * Много типов конструкторов, но самые нужные:
 * Scanner(File source, String charsetName)
 * Scanner(File source, Charset chs) throws IOEsception
 * Scanner(Path source, Charset chs) throws IOEsception
 * Scanner(InputStream source, Charset chs)
 * Scanner(String src)
 */
public class Test0 {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(new File("C:" + File.separator + "Users" + File.separator + "Work" + File.separator + "IdeaProjects" + File.separator + "PolnoyePovtorenie" + File.separator + "src" + File.separator + "ProhorenokBook" + File.separator + "InputAndOutput"+ File.separator+"Scanner_usage"+File.separator+"forScannerTest.txt"), Charset.forName("utf-8"));

        Scanner in1 = new Scanner(Paths.get("C:" + File.separator + "Users" + File.separator + "Work" + File.separator + "IdeaProjects" + File.separator + "PolnoyePovtorenie" + File.separator + "src" + File.separator + "ProhorenokBook" + File.separator + "InputAndOutput"+ File.separator+"Scanner_usage"+File.separator+"forScannerTest.txt"), Charset.forName("utf-8"));

        InputStream fin = new FileInputStream("C:" + File.separator + "Users" + File.separator + "Work" + File.separator + "IdeaProjects" + File.separator + "PolnoyePovtorenie" + File.separator + "src" + File.separator + "ProhorenokBook" + File.separator + "InputAndOutput"+ File.separator+"Scanner_usage"+File.separator+"forScannerTest.txt");
        Scanner in3 = new Scanner(fin,"utf-8");

        Scanner in4 = new Scanner("Строка 1\nстрока2\nстрока3"); //создает объект на основе строки
    }
}
