package ProhorenokBook.InputAndOutput.ReaderWriter_usage.Reader_usage;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Test2 {
    public static void main(String[] args) {
        try {
                InputStream in = new FileInputStream("C:" + File.separator + "Users" + File.separator + "Work" + File.separator + "IdeaProjects" + File.separator + "PolnoyePovtorenie" + File.separator + "src" + File.separator + "ProhorenokBook" + File.separator + "InputAndOutput" + File.separator + "ReaderWriter_usage"+File.separator+"Reader_usage"+File.separator+"ReaderTest.txt");
               Reader file = new InputStreamReader(in, StandardCharsets.UTF_8);
//                Reader file = new InputStreamReader(in, "cp1251"); // при такой кодировке возникла абракадабра РЎС‚СЂРѕРєР°1 РЎС‚СЂРѕРєР°2 РЎС‚СЂРѕРєР°3 РЎС‚СЂРѕРєР°4

            /*
            Способ 1. Читает количество символов равное размеру массива
             */
            char[] buffer = new char[10];
            int n;
            while ((n = file.read(buffer)) != -1) {
                System.out.print(String.valueOf(buffer, 0, n));
            }
            /*
            Способ 2. Читает по одному символу последовательно
             */
            int c;
            while ((c=file.read()) !=-1){
                System.out.println((char)c);
            }
        }
        catch (UnsupportedEncodingException e) {
            System.err.println("Проблемы с кодировкой");
            System.exit(1);
        }
        catch (IOException e) {
            System.err.println("Не удалось прочитать файл");
            System.exit(1);
        }
    }
}
/*
Строка1 Строка2 Строка3 Строка4
 */