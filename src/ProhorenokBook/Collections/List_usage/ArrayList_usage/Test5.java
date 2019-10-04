package ProhorenokBook.Collections.List_usage.ArrayList_usage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Получение разного вида доступа к элементам
 */
public class Test5 {
    public static void main(String[] args) {
    /*
    Возвращает элемент, расположенный по указанному индексу
     */
    List<Integer> arr0 = new ArrayList<Integer>();
    Collections.addAll(arr0, 1,3,4,5,6,7);
    System.out.println(arr0.get(3)); // 5
    System.out.println(arr0.get(0)); // 1
        /*
    Заменяет элемент, расположенный по указанному индексу другим элементом.Возвращает старый элемент, поэтому нужно
    еще раз возвратить весь массив.
        */
        List<Integer> arr1 = new ArrayList<Integer>();
        Collections.addAll(arr1, 1,3,4,5,6,7);
        System.out.println(arr1);//[1, 3, 4, 5, 6, 7]
        System.out.println(arr1.set(3,0)); // 5
        System.out.println(arr1.set(0,8)); // 1
        System.out.println(arr1); //[8, 3, 4, 0, 6, 7]
    /*
    Находит первый элемент, соответствующий указанному объекту и возвращает его индекс или значение -1 если не найден
     */
    List<Integer> arr2 = new ArrayList<Integer>();
    Collections.addAll(arr2,1,4,5,2,3,6);
        System.out.println(arr2.indexOf(5)); // 2
        System.out.println(arr2.indexOf(7)); // -1

     /*
     Находит последний элемент, соответствующий указанному объекту и возвращает его индекс или значение -1 если не найден
      */
        List<Integer> arr3 = new ArrayList<Integer>();
        Collections.addAll(arr3,1,4,5,2,3,4,6);
        System.out.println(arr3.lastIndexOf(4)); // 5
        System.out.println(arr3.lastIndexOf(7)); // -1
    /*
    Возвращает значение true если элемент присутствует и false в противном
     */
        List<Integer> arr4 = new ArrayList<Integer>();
        Collections.addAll(arr4,1,4,5,2,3,4,6,7,12,16,75);
        System.out.println(arr4.contains(2)); // true
        System.out.println(arr4.contains(66)); // false

     /*
    Возвращает значение true если все элементы присутствует и false в противном
     */
        List<Integer> arr5 = new ArrayList<Integer>();
        Collections.addAll(arr4,1,2,3,4,5,6);
        List<Integer> arr6 = new ArrayList<Integer>();
        Collections.addAll(arr6,1,2,3,4,5,6);
        System.out.println(arr6.containsAll(arr5)); // true
        arr6.add(5);
        System.out.println(arr6.toString()); //[1, 2, 3, 4, 5, 6, 5]
        System.out.println(arr6.containsAll(arr5)); // true ВАЖНО! проверяет просто наличие, а не количество элементов!
        arr6.add(9);
        System.out.println(arr6.toString()); //[1, 2, 3, 4, 5, 6, 5, 9]
        System.out.println(arr6.containsAll(arr5)); // true ВАЖНО! проверяет просто наличие
        System.out.println(arr5.containsAll(arr6)); // false


     /*
     Для точечной замены всех указанных значенией
      */
    List<Integer> arr7 = new ArrayList<Integer>();
    Collections.addAll(arr7,1,2,3,4,5,6,4,6,7,4,0);
        System.out.println(Collections.replaceAll(arr7,4,11)); // true
        System.out.println(arr7.toString()); // [1, 2, 3, 11, 5, 6, 11, 6, 7, 11, 0]
        System.out.println(Collections.replaceAll(arr7,12,15)); // false




    }
}
