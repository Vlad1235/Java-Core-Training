package ProhorenokBook.Collections.Vector_usage;


import java.util.List;
import java.util.Vector;

/**
 * Vector<E> - синхронизированный динамич список.
 *  Похож на ArrayList<E> однако класс Vector<E> явл синхонизированным и может быть использован для доступа из разных потоков.
 *  Потери на синхронизацию - минус в скорости чем у ArrayList<E>
 *  Реализует все, что и класс ArrayList, есть и свои методы. Их при необходимости отдельно можно изучить
 */
public class Test1 {
    public static void main(String[] args) {
        List<Integer> arr0 = new Vector<>();
        arr0.add(10);
        arr0.add(33);
        System.out.println(arr0.get(0)); // 10
        System.out.println(arr0.get(1)); // 33
        System.out.println(arr0.toString()); // [10, 33]
    }

}
