package GrokhaemAlgorytmyBook.BinarySearchAlgorythm;
/**
 * Бинарный алгоритм поиска.O(log[2]n)
 */

import java.util.Arrays;
import java.util.Scanner;

public class ExampleBinarySearch {
    public static void main(String[] args) {
        int counter, num, item, first, last;
        int[] array;

        // Создаем объект Scanner для считывния чисел, введенных клиентом.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        num = scanner.nextInt();

        // Создаем массив введенного размера
        array = new int[num];

        System.out.println(" Введите " + num + " чисел");

        // Заполняем массив, вводя элементы в консоль
        for (counter = 0; counter < num; counter++) {
            array[counter] = scanner.nextInt();
        }
        // Сортируем элементы массива, так как это требование для использования бинарного поиска
        Arrays.sort(array);

        System.out.println("Введите элемент для поиска, используя бинарный алгоритм");
        item = scanner.nextInt();
        first = 0;
        last = num - 1;

        // Метод принимает начальниый и последний индекс, а также число для поиска.
         binarySearch(array, first, last, item);
    }


        public static void binarySearch(int[] array, int first, int last, int item){
            int position;
            int comparisonCount = 1; // для подсчета количества сравнений.

            // Для начала найдем индекс среднего элемента массива.
            position = (first+last)/2;
            while((array[position] != item)&&(first <=last)){
                comparisonCount++;
                if(array[position] > item){ // если число заданного для поиска за серединой.
                    last = position-1; // уменьшаем позицию на 1.
                } else {
                    first = position + 1; // увеличиваем на 1.
                }
                position = (first+last)/2; // задаем новые первый и последний элементы и снова прогоняем цикл.
           }
            if(first <=last){
                System.out.println(item + " является " + ++position + " элементом массива.");
                System.out.println("Метод бинарного поиска нашел число после " + comparisonCount + " сравнений.");
            } else {
                System.out.println("Элемент не найден в массиве. Метод бинарного поиска закончил работу после " + comparisonCount + " сравнений.");
            }

        }
}
/*
Введите количество элементов массива:
10
 Введите 10 чисел
12
14
15
16
18
90
17
84
32
42
Введите элемент для поиска, используя бинарный алгоритм
42
42 является7 элементом массива.
Метод бинарного поиска нашел число после 2 сравнений.
 */