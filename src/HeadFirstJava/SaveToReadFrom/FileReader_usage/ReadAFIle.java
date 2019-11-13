package HeadFirstJava.SaveToReadFrom.FileReader_usage;

import java.io.*;

public class ReadAFIle {
    public static void main(String[] args) {
        try{
            File myFile = new File("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\HeadFirstJava\\SaveToReadFrom\\File_usage\\ForTestReadingFrom.txt");
            FileReader fr = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fr);
            String line = null; // Создаем строковую переменную для временного хранения каждой строки в процессе чтения
            while ((line=reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException ex){
            System.out.println("File not found in designated directory");
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
/*
This information for test only. Bla Bla Bla.
 */