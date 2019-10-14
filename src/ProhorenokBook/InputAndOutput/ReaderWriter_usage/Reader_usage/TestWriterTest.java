package ProhorenokBook.InputAndOutput.ReaderWriter_usage.Reader_usage;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TestWriterTest {
    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("C:" + File.separator + "Users" + File.separator + "Work" + File.separator + "IdeaProjects" + File.separator + "PolnoyePovtorenie" + File.separator + "src" + File.separator + "ProhorenokBook" + File.separator + "InputAndOutput" + File.separator + "ReaderWriter_usage" + File.separator + "Writer_usage" + File.separator + "WriterTest.txt");
            Reader file = new InputStreamReader(in, Charset.forName("cp1251"));

            char[] buffer = new char[10];
            int n;
            while ((n = file.read(buffer)) != -1) {
                System.out.print(String.valueOf(buffer, 0, n));
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
слово слово2 слово3 слово4 слово5 слово6
 */