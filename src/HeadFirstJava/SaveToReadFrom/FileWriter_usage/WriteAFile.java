package HeadFirstJava.SaveToReadFrom.FileWriter_usage;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Запись текстовых данных, строки, вместо объекта, используется класс FileWriter вместо FileOutputStream
 */
public class WriteAFile {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("C:\\Users\\Work\\IdeaProjects\\PolnoyePovtorenie\\src\\HeadFirstJava\\SaveToReadFrom\\FileWriter_usage\\Notebook.txt");
            writer.write("Привет, как дела");
            writer.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
