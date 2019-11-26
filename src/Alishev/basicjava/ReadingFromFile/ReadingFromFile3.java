package Alishev.basicjava.ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Как из строки считать числовые примитивы
 */
public class ReadingFromFile3 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:"+File.separator+"Projects"+File.separator+"MyTraining"+File.separator+"src"+File.separator+"Alishev"+File.separator+"basicjava"+File.separator+"ReadingFromFile"+File.separator+"Test3.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine(); // считываем из файла 1 строку в файле сразу. (если есть 2ая строка, он ее не прочитает)
        String[] numberString = line.split(" "); // МЕТОД разделит сроку основываясь на пробелы между значениями
        int[] numbers = new int[3];
        int counter = 0;

        for (String number:numberString){
            numbers[counter++] = Integer.parseInt(number); // из типа String в тип int
        }
        System.out.println(Arrays.toString(numbers));
        scanner.close();

    }
}
/*
[1, 2, 3]
 */