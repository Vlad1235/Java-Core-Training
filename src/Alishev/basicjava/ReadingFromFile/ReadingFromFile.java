package Alishev.basicjava.ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Java для начинающих. Урок 36: Чтение из файла.
 */
public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:"+File.separator+"Projects"+File.separator+"MyTraining"+File.separator+"src"+File.separator+"Alishev"+File.separator+"basicjava"+File.separator+"ReadingFromFile"+File.separator+"Test.txt");
        Scanner scanner = new Scanner(file); // может не только с консоли считывать, но также и из файла
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();

    }
}
/*
First line
Second line
Third line
 */