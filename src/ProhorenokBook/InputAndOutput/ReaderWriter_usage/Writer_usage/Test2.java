package ProhorenokBook.InputAndOutput.ReaderWriter_usage.Writer_usage;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Test2 {
    public static void main(String[] args) {
        OutputStream out = null;
        Writer file=null;
       try {
           try {
            /*
            При неправельном указании пути, будет выбрасывать ошибку.
             */
                out = new FileOutputStream("C:" + File.separator + "Users" + File.separator + "Work" + File.separator + "IdeaProjects" + File.separator + "PolnoyePovtorenie" + File.separator + "src" + File.separator + "ProhorenokBook" + File.separator + "InputAndOutput" + File.separator + "ReaderWriter_usage" + File.separator + "Writer_usage" + File.separator + "WriterTest.txt");
               file = new OutputStreamWriter(out, "cp1251");
               // Writer file = new OutputStreamWriter(out, StandardCharsets.UTF_8);

               char[] chars = "слово2".toCharArray(); // из String в массив символов
               file.write(chars, 0, 5);
               file.write(' ');
               file.write(chars);
               file.write(" слово3");
               file.write(" слово4444", 0, 7);
               file.append(' ');
               StringBuilder sb = new StringBuilder();
               sb.append("слово5");
               file.append(sb);
               file.append(" слово66666", 0, 7);
           } finally {
               if (file != null) file.close();
           }
       }
        catch (UnsupportedEncodingException e) {
            System.err.println("Проблемы с кодировкой");
            System.exit(1);
        }
        catch (IOException e) {
            System.err.println("Не удалось записать в файл");
            System.exit(1);
        }
        System.out.println("Данные успешно записаны в файл");
        }
}

/*
Данные успешно записаны в файл
 */

// Важно!!! НЕ высвечивалась информация в файле WriterTest.txt
// Проблема была в том, что я НЕ ЗАКРЫЛ поток!!!!