package ProhorenokBook.BufferedStream.BufferedWriter_BufferedReader.BufferedReader_usage;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) throws IOException {
        try(
                InputStream in = new FileInputStream("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\BufferedStream\\BufferedWriter_BufferedReader\\forTest.txt");
                Reader reader = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader buf = new BufferedReader(reader);
                )
        {
            Stream<String> stream = buf.lines();
            stream.forEachOrdered((line)-> System.out.println(line));
        }
    }
}
/*
СтРоКа1
строка2
НОВАЯ строка добавлена другим способом
 */