package ProhorenokBook.Collections.ArrayList_usage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Test10 {
    /**
    Способы для перебора элементов.
     Циклы
     метод iterator()
     метод replaceAll()
     Интерфейс Listiterator<E>. В данном можно детально работать со списком выполняя множество операций.

     */
    public static void main(String[] args) {
       /*
       Цикл forEach()
        */
        List<Integer> arr0 = new ArrayList<>();
        Collections.addAll(arr0, 14,53,2352,64,4,3,52,0,45,1,5,125,6,1532,7,567,8,954,9,99);
        arr0.forEach(elem -> System.out.println(elem));
        System.out.println(arr0.toString()); // [14, 53, 2352, 64, 4, 3, 52, 0, 45, 1, 5, 125, 6, 1532, 7, 567, 8, 954, 9, 99]

        /*
        метод replaceAll(). С помощью этого метода можно ввернуть новый элемент
         */
        List<Integer> arr1 = new ArrayList<>();
        Collections.addAll(arr1,1,2,3,4,5,6);
        arr1.replaceAll(elem -> elem*2);
        System.out.println(arr1.toString()); // [2, 4, 6, 8, 10, 12]
    /*
     Интерфейс Listiterator<E>. Много различных методов в нем. При необходимости отдельно изучу.
     */
        List<Integer> arr2 = new ArrayList<>();
        Collections.addAll(arr2,1,2,3,4,5,6);
        ListIterator<Integer> it = arr2.listIterator();
        // hasNext() возвращает true если можно получить следующий элемент
        // next() перемещает указатель на следующий элемент. Общий принцип этого интерфейса - сам должен перемещать
        while (it.hasNext()){
            System.out.print(it.next() + " "); // 1 2 3 4 5 6
        }
    }
}
