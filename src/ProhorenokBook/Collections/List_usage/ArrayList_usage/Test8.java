package ProhorenokBook.Collections.List_usage.ArrayList_usage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test8 {
    /**
     * Перемешивание и переворачивание списка
     */
    public static void main(String[] args) {
    /*
    Свой пример.
    Задача! есть массив чисел. Нужно переставить значения в обратном порядке.
    Сначала в список, используем методы из коллекции, затем обратно в массив
     */
        Integer[] myExample = {1,2,3,5,6,8,10,15,25};
        List<Integer> myListExample = Arrays.asList(myExample);
        Collections.reverse(myListExample); // метод reverse() чтобы в обратном порядке
        System.out.println(myListExample.toString()); // [25, 15, 10, 8, 6, 5, 3, 2, 1]
        Integer[] myExampleReversed = myListExample.toArray(new Integer[myListExample.size()]);
        System.out.println(Arrays.toString(myExampleReversed)); // [25, 15, 10, 8, 6, 5, 3, 2, 1]

        /*
        метод shuffle() перемешивает в случайном порядке элементы
         */
        List<Integer> arr0 = new ArrayList<>();
        Collections.addAll(arr0, 1,2,3,4,5,6,7,8,9,10);
        Collections.shuffle(arr0);
        System.out.println(arr0.toString()); // [8, 2, 10, 7, 4, 9, 1, 6, 5, 3]

        /*
        метод rotate() сдвигает ВСЕ элементы на заданное расстояние. Причем порядок не меняется. Метод вращает
        элементы внутри списка не меняя их последовательность.
         */
        List<Integer> arr1 = new ArrayList<>();
        Collections.addAll(arr1,1,2,3,4,5,6);
        Collections.rotate(arr1,2);
        System.out.println(arr1.toString()); // [5, 6, 1, 2, 3, 4]
        /*
        Важно!! Если снова сдивагать, то оригинальный массив уже сдвижен! Я заметил
         */
        Collections.rotate(arr1,2);
        System.out.println(arr1.toString()); // [2, 3, 4, 5, 6, 1]


        /*
        менять два элемента местами swap()
         */
        List<Integer> arr2 = new ArrayList<>();
        Collections.addAll(arr2,1,4,5,7,9,12,14);
        Collections.swap(arr2,0,arr2.size()-1); // поменял первый элемент с последним элементом. Не забыть удалять 1 единицу
        System.out.println(arr2.toString()); // [14, 4, 5, 7, 9, 12, 1]
    }
}
