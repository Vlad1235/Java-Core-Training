package ProhorenokBook.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Преобразование потока в коллекцию, массив или другой объект
 *
 * После выполнения промежуточных операций поток можно преобразовать в коллекцию, массив или другой объект
 *
 * методы:
 * toArray() - возвращает массив
 * collect() - преобразовать поток в коллекцию или др объект
 * и другие
 */
public class Test0000 {
    public static void main(String[] args) {
        int[] arr = IntStream.rangeClosed(1,10)
                .map(x->x*2).toArray();
        System.out.println(Arrays.toString(arr)); // [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

        List<Integer> obj = Stream.of(1,2,3)
                .collect(Collectors.toList());
        System.out.println(obj.toString()); // [1, 2, 3]
    }
}
