package ProhorenokBook.StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * ПРОМЕЖУТОЧНЫЕ ОПЕРАЦИИ
 *
 *  После создания потока над данными могуто производится различные промежуточные операции - например фильтрация данных
 *  Любая промежуточная операция возвращает поток, с которым можно выполнять другие промежуточные операции.
 *  Все промежуточные операции выполняются ТОЛЬКО при выполнеии терминальной операции
 *
 *  Основные методы, выполняющие промежуточные операции:
 *  метод filter() - фильтрация данных
 *  map() - применяет метод mapper() к каждому элементу потока. Внутри этого метода наобходимо вернуть новое значение
 *  limit() - позволяет ограничить поток указанным количеством элементов
 *  skip() - пропустить указанное количество первых элементов
 *  distinct() - оставить в потоке только уникальные элементы. НЕ сортирует!
 *  peek() - используется для отладки, для вывода промежуточных результатов
 *  sorted() - сортировка элементов. Указать объект реализ параметр Comparator<T>, а если не указан, то Comparable<T>
 *  parallel() - последоватьльный поток преобразуется в параллельный
 *  sequential() - параллельный в последовательный преобразование
 *  unordered() - делает поток неупорядоченным.Упорядоченный поток требует дополнительных затрат ресурсов для поддержания порядка следования элементов.Если сделать неупорядоченным, то при использовании параллельных потоков  можно на некоторых операция получить прирост производительности.
 *  takeWhile() - применяет метод predicate к элементам потока до тех пор, пока он возращает true. Поток должен быть последовательным и упорядоченным
 * dropWhile()  - подобен предыдущему
 *
 * Преобразование типа потока  - поток одного типа можно преобразовать в поток другого с помощью ПРОМЕЖУТОЧНЫХ методов:
 * asLongStream() - преобразует поток IntStream в поток LongStream
 * asDoubleStream()
 * boxed() - преобразует поток элементарных типов в поток объектных данных
 * mapToInt() - преобразует поток в IntStream
 * mapToLong()
 * mapToDouble()
 * mapToObj() - преобразует поток элементарных данных в объектный поток
 *
 * Объединение и добавление потоков
 * concat() - объединение двух однотипных потоков
 * flatMap() - позволяет на основе одного элемента добавить поток элементов
 * др
 *
 */
public class Test00 {
    public static void main(String[] args) {
        /*
        Пример получения нечетных чисел
         */
        IntStream.rangeClosed(1,10)
                .filter(x->(x%2) !=0)
                .forEachOrdered(n-> System.out.print(n + " ")); //1 3 5 7 9
        System.out.println(); // чтобы строки разбить
        /*
        Умножить каждый элемент на 2
         */
        IntStream.rangeClosed(1,2)
                .map(x->x*2)
                .forEachOrdered(n-> System.out.print(n + " ")); // 2 4
        System.out.println(); // чтобы строки разбить
        /*
        Вывести только первые 5 элементов
         */
        IntStream.rangeClosed(1,10)
                .limit(5)
                .forEachOrdered(n-> System.out.print(n + " ")); // 1 2 3 4 5
        System.out.println(); // чтобы строки разбить
        /*
        вывести все, кроме первых пяти
         */
        IntStream.rangeClosed(1,10)
                .skip(5)
                .forEachOrdered(n-> System.out.print(n + " ")); // 6 7 8 9 10
        System.out.println(); // чтобы строки разбить
        /*
        Оставить в потоке только уникальные элементы
         */
        IntStream.of(1,1,1,1,2,2,4,4,4,3,5,7,7,7,7)
                .distinct()
                .forEachOrdered(n-> System.out.print(n + " ")); // 1 2 4 3 5 7
        System.out.println(); // чтобы строки разбить
        /*
        Вывод промежутончых результатов
         */
        List<Integer> arr = Stream.of(1,1,1,2,3,4,4,7,7,8,5,5)
                                    .peek(n-> System.out.print(n+ " ")) // 1 1 1 2 3 4 4 7 7 8 5 5
//        System.out.println(); НЕЛЬЗЯ каких строчек кода вставить между методами
                                    .distinct()
                                    .collect(Collectors.toList());
        System.out.println(arr.toString()); //[1, 2, 3, 4, 7, 8, 5]
        /*
        Сортировка
         */
        IntStream.of(9,1,2,3,2,5,7,6)
                .distinct()
                .sorted()
                .forEachOrdered(n-> System.out.print(n + " ")); // 1 2 3 5 6 7 9
        System.out.println();
        /*
        Последовательный в параллельный
         */
        IntStream.of(9,1,2,3,2,5,7,6)
                .parallel()
                .map(x -> x*2)
                .sorted()
                .forEachOrdered(n-> System.out.print(n + " ")); // 2 4 4 6 10 12 14 18
        System.out.println();
        /*
        Неупорядоченный поток
         */
        List<Integer> arr1 = new ArrayList<>();
        Collections.addAll(arr1,9,1,3,2,5,7,6);
        arr1.parallelStream()
                .unordered()
                .map(x->x*2)
                .sorted()
                .forEachOrdered(n-> System.out.print(n + " ")); // 2 4 6 10 12 14 18

        /*
        подобно фильтру
         */
        Stream<Integer> stream = Stream.of(0,1,2,3,4,3,2,1,0);
                                        stream.takeWhile(n->n<=3)
                                                .forEachOrdered(x-> System.out.print(x + " ")); //2 4 6 10 12 14 18
        System.out.println();


        /*
        преобразование одного потока одного типа в поток другого
         */
        IntStream.of(1,2,3,4,5)
                .asDoubleStream() //asLongStream()
                .forEachOrdered(n-> System.out.print(n + " ")); // 1.0 2.0 3.0 4.0 5.0
        System.out.println();

        /*
        Преобразование массива целых чисел в список
         */
        int[] a = {1,2,3,4,5,6};
        List<Integer> arr2 = IntStream.of(a)
                                        .boxed()
                                        .collect(Collectors.toList());
        System.out.println(arr2); // [1, 2, 3, 4, 5, 6]

        /*
        Преобразование в IntStream
         */
        DoubleStream.of(1.2,5.0,4.3)
                .mapToInt(x->(int)x)
                .forEachOrdered(n-> System.out.print(n + " "));
        System.out.println(); // 1 5 4

        /*
        Поток элементарных типов в объектный поток
         */
        int[] aa = {1,2,3,4,5,6,7};
        List<Integer> arr3 = IntStream.of(aa)
                                        .mapToObj(x->Integer.valueOf(x))
                                        .collect(Collectors.toList());
        System.out.println(arr3); //[1, 2, 3, 4, 5, 6, 7]
    }
}
/*

 */