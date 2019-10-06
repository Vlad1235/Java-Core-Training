package ProhorenokBook.Collections.List_usage.ArrayList_usage;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Test7 {
    /**
     * Массив в список.
     * Для преобразования обычного массива в список можно использовать статическим методом addAll() из класса Collections.
     */
    public static void main(String[] args) {
        /*
        метод addAll()
         */
        Integer[] arrIn0 = {1,4,5,7,9,12};
        List<Integer> arr0 = new ArrayList<>();
        arr0.add(55);
        Collections.addAll(arr0,arrIn0);
        System.out.println(arr0.toString()); //[55, 1, 4, 5, 7, 9, 12]

        /*
        Статический метод asList() из класса Arrays позволяет обернуть список вокруг обычного массива. После можно
        выполнять любые действия, КРОМЕ ДОБАВЛЕНИЯ или УДАЛЕНИЯ. Так как длина фиксирована. Работаем с оригиналом массива!
        метод asList()
         */
        Integer[] arrIn1 = {30,2,4,6,7,8};
        List<Integer> arr1 = Arrays.asList(arrIn1); // Важно!! мы не создаем отдельный список, а ОБОРАЧИВАЕМ текущий. Все изменения отразятся!
        System.out.println(arr1.toString()); // [30, 2, 4, 6, 7, 8]
        arr1.set(0,88); // замена 30  на 88
        System.out.println(arr1.toString()); // [88, 2, 4, 6, 7, 8]
        System.out.println(Arrays.toString(arrIn1)); //[88, 2, 4, 6, 7, 8] Важно! Изменения отразились на оригинале!

        /*
        Если работать с копией, а оригинал оставить не тронутым
         */
        Integer[] arrIn2 = {30,2,4,6,7,8};
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(arrIn2));
        System.out.println(arr2.toString()); //[30, 2, 4, 6, 7, 8]
        arr2.set(1,777);
        System.out.println(arr2.toString()); // [30, 777, 4, 6, 7, 8]
        System.out.println(Arrays.toString(arrIn2)); // [30, 2, 4, 6, 7, 8]

        /*
        Наоборот преобразовать список в массив позволяет метод toArray(). Главный способ, хотя есть и другие.
         */
        List<Integer> arr3 = new ArrayList<>();
        Collections.addAll(arr3,14,16,16,13,156,109);
        System.out.println(arr3.toString()); // [14, 16, 16, 13, 156, 109]

        /*
        1 способ, через массив создание нового массива с указанием его длины
         */
        Integer[] arrInt2 = arr3.toArray(new Integer[arr3.size()]);
        System.out.println(Arrays.toString(arrInt2)); // [14, 16, 16, 13, 156, 109]

    }
}
