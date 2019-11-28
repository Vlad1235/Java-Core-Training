package Alishev.middleleveljava.lambda.lamdamoreusage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  эти методы позволяют быстро работать с массивами и коллекциями
 * map() - менять значения
 * filter() - фильтровать
 * forEach() - выводить на экран
 * reduce()  - выводить сумму, разность, произведение и тп - вообщем выводить 1 число
 */
public class Test2 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArr(arr1);
        fillList(list2);

        list2 = list2.stream().map(a -> a * 2).collect(Collectors.toList());

        arr1 = Arrays.stream(arr1).map(a -> 3).toArray(); // заменяем каждый элемент массива на 3
        arr1 = Arrays.stream(arr1).map(a -> a + 1).toArray(); // увеличиваем каждый элемент массива на 1

        System.out.println(Arrays.toString(arr1));
        System.out.println(list2);

        // метод filter()  Принимает лямбда выражение
        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();
        fillArr(arr3);
        fillList(list3);
        // задача отсортировать по четным числам
        arr3 = Arrays.stream(arr3).filter(a -> a % 2 == 0).toArray();
        list3 = list3.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

        System.out.println(Arrays.toString(arr3)); //[2, 4, 6, 8, 10]
        System.out.println(list3); // [2, 4, 6, 8, 10]

        // Для вывода на экран всех элементов массива   forEach()
        Arrays.stream(arr3).forEach(System.out::println); // и так
        list3.stream().forEach(a -> System.out.println(a)); // и так одинаково

        // метод reduce().  Возьмем и уменьшим до одного элемента. Например посчитать СУММУ всех элементов для массива и ПРОИЗВЕДЕНИЕ ВСЕХ элементов для List()
        int[] arr4 = new int[10];
        List<Integer> list4 = new ArrayList<>();
        fillArr(arr4);
        fillList(list4);

        // tmp это временная переменная счетчик по умолчанию равна первому значению массива(или листа) и итерация начинается со второго элемента. Затем новое итоговое значение(суммы или произведения) присваеивается переменной tmp и идет на след итерацию
        // b на каждой итерации равняется текущему элементу.
        // getAsInt() и get() преобразует поток в целое число
        int sum = Arrays.stream(arr4).reduce((tmp, b) -> tmp + b).getAsInt();
        int multiply = list4.stream().reduce((tmp, b) -> tmp * b).get();

        System.out.println(sum); // 55
        System.out.println(multiply); // 3628800

    }

    private static void fillList(List<Integer> list2) {
        for (int i = 0; i < 10; i++) {
            list2.add(i + 1);
        }
    }


    private static void fillArr(int[] arr1) {
        for (int i = 0; i < 10; i++) {
            arr1[i] = i + 1;
        }
    }
}

