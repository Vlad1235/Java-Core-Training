package Alishev.basicjava.lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile2 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:"+File.separator+"Projects"+File.separator+"MyTraining"+File.separator+"src"+File.separator+"Alishev"+File.separator+"basicjava"+File.separator+"lesson36"+File.separator+"Test2.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine(); // считываем из файла 1 строку в файле сразу. (если есть 2ая строка, он ее не прочитает)
        String[] numbers = line.split(" "); // МЕТОД разделит сроку основываясь на пробелы между значениями
        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }
}
/*
[first, second, third]
 */