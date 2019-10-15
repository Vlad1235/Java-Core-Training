package ProhorenokBook.BufferedStream.BufferedWriter_BufferedReader.BufferedReader_usage;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test3 {
    public static void main(String[] args) throws IOException {
        /*
        Из 3х строчек кода в 1у все уместили используя статический метод newBufferedReader
         */
        try(
                BufferedReader buf = Files.newBufferedReader(Paths.get("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\ProhorenokBook\\BufferedStream\\BufferedWriter_BufferedReader\\forTest.txt"), Charset.forName("utf-8"));
                )
        {
            String line = "";
            while ((line = buf.readLine()) != null){
                System.out.println(line);
            }
        }
    }
}
/*
СтРоКа1
строка2
НОВАЯ строка добавлена другим способом
 */