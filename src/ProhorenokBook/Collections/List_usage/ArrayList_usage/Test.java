package ProhorenokBook.Collections.List_usage.ArrayList_usage;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList<E> - добавить элементы можно в любое место списка, при этом размер списка будет автоматически увелич по мере необходимости.
 * Получить доступ к элементу можно по индексу get(element), или реализовав итератор.
 * При удалении элемента происходит сдвиг всех последующих элементов на одну позицию влево. Емкость не изменяется(следить за пустой тратой ресурсов)
 * ArrayList(); (int initialCapacity) - можно указать емкость изначально.
 * ArrayList(Collection<? extends E> c>); - создать список на основе другой коллекции
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<Integer>();
        System.out.println(arr1.size()); // 0
        arr1.add(10);
        arr1.add(20);
        System.out.println(arr1.get(0)); // 10
        System.out.println(arr1.get(1)); // 20


        List<Integer> arr2 = new ArrayList<Integer>(100);
        System.out.println(arr2.size());
            for (int i = 1; i < 101; i++){
                arr2.add(i);
            }
        System.out.println(arr2.get(0)); //1
        System.out.println(arr2.get(99)); // 100
        System.out.println(arr2.size()); // 100

        /*
        Третий конструктор, когда мы передаем значения из другой коллекции
         */
        List<Integer> arr3 = new ArrayList<Integer>(arr2);
        System.out.println(arr3.size()); // 100
        System.out.println(arr3.get(99)); // 100
        System.out.println(arr3.get(0)); // 1
    }
}
