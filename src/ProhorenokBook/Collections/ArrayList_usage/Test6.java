package ProhorenokBook.Collections.ArrayList_usage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Различные методы в ArrayList()
 */
public class Test6 {
    public static void main(String[] args) {
        /*
        Бинарный поиск внутри ОТСРТИРОВАННОГО массива. Метод возвращает индекс найденного элемента или отрицательное число
         */
        List<Integer> arr0 = new ArrayList<Integer>();
        Collections.addAll(arr0,1,3,2,3,2,8);
        arr0.sort(null); // сортировка
        System.out.println(arr0.toString()); // [1, 2, 2, 3, 3, 8]
        int index = Collections.binarySearch(arr0,3);
        System.out.println(index); //4 // метод вовзвращает первый найденный по порядку элемент(!!!!НЕ ИНДЕКС ЕГО А ИМЕННО ПО ПОРЯДКУ)
        int noFind = Collections.binarySearch(arr0,5);
        System.out.println(noFind); // -6 Важно! возвращает отрицательное число в расчете -(index)-1


        /*
        Сравнение без учета регистра символов
         */
        List<String> arr1 = new ArrayList<String>();
        Collections.addAll(arr1,"еда","единица1","Единый","Единица2");
        arr1.sort(String.CASE_INSENSITIVE_ORDER); // сортировка не учитывая регистр
        System.out.println(arr1.toString()); // [еда, единица1, Единица2, Единый]
        int x = Collections.binarySearch(arr1,"Единица1",String.CASE_INSENSITIVE_ORDER);
        System.out.println(x); // 1

        /*
        Подсчет колличества элементов с указанным значением
         */
        List<Integer> arr2 = new ArrayList<Integer>();
        Collections.addAll(arr2,1,3,2,3,2,2);
        System.out.println(Collections.frequency(arr2,2)); // 3

        List<String> arr3 = new ArrayList<String>();
        Collections.addAll(arr3,"Слово","Слово","дело","слово","глупость","Результат");
        System.out.println(Collections.frequency(arr3,"слово")); // 1

        /*
        Поиск максимального и и минималного значений в списке
         */
        List<Integer> arr4 = new ArrayList<>();
        Collections.addAll(arr4,12,2,5,6,7,8,9);
        Integer min = Collections.min(arr4);
        System.out.println(min); // 2
        Integer max = Collections.max(arr4);
        System.out.println(max); // 12




    }
}
