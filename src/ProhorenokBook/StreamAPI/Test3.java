package ProhorenokBook.StreamAPI;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Создание потока из массива или списка значений
 * Для создания потока из массива предназначен статический метод stream() из класса Arrays
 *
 * Параметр start задает начальный индекс, end - конечный(не включительно).Если параментры не указаны, то будут использованы все элементы.
 *
 * Интерфейсы LongStream, IntStream, DoubleStream являются потоками данных соответствующих типов
 * Интрефейс Stream<T> потоком объектных типов
 *
 * Потоки не изменяют данные источника!
 *
 * метод of() - создание потока на основе массива,списка значений или отдельных значений
 * метод builder() - создание потока на основе отдельных значений
 * метод ofNullble() - создает поток из заданного значения. Если вместо значения null, то пустой поток
 */
public class Test3 {
    public static void main(String[] args) {
            /*
            Создание потока на основе целочисленного массива
             */
        int[] arr = {1,2,3,4,5,6};
        IntStream stream = Arrays.stream(arr).parallel();
        int[] arr2 = stream.unordered().map((x)->x*2).toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        /*
        Вывод только четных чисел
         */
        IntStream stream1 = IntStream.of(1,2,3,4,5).parallel();
        stream1.unordered()
                .filter((x)->(x%2)==0)
                .forEachOrdered(x-> System.out.print(x + " "));
        System.out.println();
        /*
        Вывод значений методом builder()
         */
        IntStream stream2 = IntStream.builder().add(1).add(2).add(3).build();
        stream2.forEachOrdered(x-> System.out.print(x + " "));
    }
}
/*
[1, 2, 3, 4, 5, 6]
[2, 4, 6, 8, 10, 12]
2 4
1 2 3
 */