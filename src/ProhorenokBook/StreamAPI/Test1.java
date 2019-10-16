package ProhorenokBook.StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * Создание потока из коллекции
 */
public class Test1 {
    public static void main(String[] args) {
    /*
    Выведем все элементы списка, значения которых меньше 4
    Метод filter() является промежуточной операцией
    метод forEachOrdered() терминальной операцией
     */
    List<Integer> arr = new ArrayList<>();
    Collections.addAll(arr,1,2,3,4,5,6,7);
    Stream<Integer> stream = arr.stream();
    stream.filter((x)->x<4).forEachOrdered((x)-> System.out.print(x + " ")); // 1 2 3

    }
}
