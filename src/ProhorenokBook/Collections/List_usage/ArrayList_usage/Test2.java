package ProhorenokBook.Collections.List_usage.ArrayList_usage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        /*
        Метод для создания нужного колличества элементов, с указанным нами значением.
         */
        List<Integer> arr = new ArrayList<Integer>(Collections.nCopies(5,8));
        System.out.println(arr.toString()); //[8, 8, 8, 8, 8]

        /*
        В Джава 9 в интерфейс List<E> был добавлен статический метод of() который создает неизменяемый список
         */
        List<Integer> arr1 = List.<Integer>of(1,2,3,4,5);
        System.out.println(arr1.size()); //5
        // arr1.add(98); ошибка!!  Exception in thread "main" java.lang.UnsupportedOperationException
        Integer[] arrInt = {1,2,5,7,9,0};
        List<Integer> arr2 = List.<Integer> of(arrInt);
        System.out.println(arr2.size()); // 6
        /*
        В Джава 10 в интерфейс List<E> был добавлен статический метод copyOf() который создает неизменяемый список на основе других коллекций
         */
        var arr3 = new ArrayList<Integer>();
        Collections.addAll(arr3,1,2,4,5,6,7);
        List<Integer> arr4 = List.copyOf(arr3);
        System.out.println(arr4.size()); // 6
        System.out.println(arr4.toString()); // [1, 2, 4, 5, 6, 7]
        System.out.println(arr4.isEmpty()); // false

    }
}
