package Algorythms.Sort.sort1;

import java.util.Arrays;
import java.util.Collections;

public class MetodSortYbivanie {
       /*
    Метод sort() из класса Arrays использует усовершенствованный алгоритм Быстрой сортировки (Quicksort),
    который эффективен в большинстве случаев. Для того чтобы отсортировать массив,
    необходимо написать всего одну строку:
    Arrays.sort(arr);// где arr это имя массива
    Примечание: в начале файла предварительно нужно подключить библиотеку  java.util.
    import java.util.*;
    !!!!!! Обратите внимание, что при сортировке массива в обратном порядке (по убыванию) нужно использовать
    тип Integer[] вместо примитивного типа int[].
    !!!!! В этом примере массив имен сортируется в порядке от А до Я.
    Для того чтобы отсортировать массив в обратном порядке,
    необходимо в методе sort() указать Collections.reverseOrder().
    Arrays.sort(names, Collections.reverseOrder());
     */
    //  Пример: Сортировка массива целых чисел по убыванию
    public void metodSortYbiv1() {
        Integer [] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ,");
        }
        System.out.println();
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ,");
        }
    }
}

/*
47 ,31 ,99 ,78 ,6 ,20 ,95 ,5 ,39 ,86 ,55 ,17 ,25 ,28 ,29 ,49 ,29 ,22 ,65 ,51 ,
99 ,95 ,86 ,78 ,65 ,55 ,51 ,49 ,47 ,39 ,31 ,29 ,29 ,28 ,25 ,22 ,20 ,17 ,6 ,5 ,
 */