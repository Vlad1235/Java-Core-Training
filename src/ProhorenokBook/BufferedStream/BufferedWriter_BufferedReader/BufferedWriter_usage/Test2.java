package ProhorenokBook.BufferedStream.BufferedWriter_BufferedReader.BufferedWriter_usage;

import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * пример добавления строк в файл.
 * Чтобы добавить строки к уже существующим в файле, необходимо явно указать опцию StandardOpenOption.APPEND
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        /*
        Способ записи из 3х строк, в 1ой прописать
         */
        try(
                BufferedWriter buf = Files.newBufferedWriter(Paths.get("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\BufferedStream\\BufferedWriter_BufferedReader\\forTest.txt"), Charset.forName("utf-8"), StandardOpenOption.APPEND);
                // BufferedWriter buf = Files.newBufferedWriter(Paths.get("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\BufferedStream\\BufferedWriter_BufferedReader\\forTest.txt"), Charset.forName("utf-8")); // Тут файл будет с нуля перезаписан
                ){
            buf.newLine();
            buf.write("НОВАЯ строка добавлена другим способом");
            buf.flush();
        }
    }
}
