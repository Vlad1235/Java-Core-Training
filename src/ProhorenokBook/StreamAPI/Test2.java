package ProhorenokBook.StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Пример, как данные расперделяются по потокам, на примере умножения каждого элемента списка на 2 внутри метода map()
 * каждому потоку достанутся отдельные данные.
 */
public class Test2 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Collections.addAll(arr,1,2,3,4,5,6,7);
        Stream<Integer> stream = arr.parallelStream();
        List<Integer> arr2 = stream.unordered().map((x)->{
            System.out.println(
                    Thread.currentThread().getName() + " x= " + x);
            return x*2;
        }).collect(Collectors.toList());
        System.out.println(arr2.toString());
    }
}
/*
ForkJoinPool.commonPool-worker-5 x= 7
ForkJoinPool.commonPool-worker-3 x= 2
ForkJoinPool.commonPool-worker-7 x= 6
ForkJoinPool.commonPool-worker-7 x= 1
main x= 5
ForkJoinPool.commonPool-worker-5 x= 4
ForkJoinPool.commonPool-worker-3 x= 3
[2, 4, 6, 8, 10, 12, 14]

 */