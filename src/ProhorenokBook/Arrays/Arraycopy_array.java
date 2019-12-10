package ProhorenokBook.Arrays.Sorting;

import java.util.Arrays;

/**
 *
 * !!!!!! ОЧЕНЬ важно При использовании методов копирования arraycopy(), copyOf(),copyOfRange() - копируются значения ссылками!
 * Если в оригинале или во втором изменить значения то это отразится и на втором и на первом.
 *
 *
 * в ОДНОМЕРНЫХ МАССИВАХ ТАКОЙ ПРОБЛЕМЫ НЕТ, ОДНАКО ЕСЛИ МАССИВ НЕ ХРАНИТ ОБЪЕКТЫ КЛАССОВ
 *
 *
 *ВАЖНО!! РЕАЛЬНУЮ КОПИЮ МАССИВА(НЕ ПРИВЯЗАННУЮ К ОРИГИНАЛУ) МЫ МОЖЕМ ПОЛУЧИТЬ ТОЛЬКО ПРИ ИСПОЛЬЗОВАНИИ ЭЛЕМЕНТАРНЫХ ТИПОВ.
 * ПРИ ИСПОЛЬЗОВАНИИ ОБЪЕКТОВ И МНОГОМЕРНЫХ МАССИВОВ ВСЕГДА БУДУТ КОПИРОВАТЬСЯ ЛИШЬ ССЫЛКИ
 *
 *
 */
public class Arraycopy_array {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5}, arr2 = new int[5];
        System.arraycopy(arr1,0,arr2,0,arr1.length); // arr1.length - это количество копируемых элементов. Главное, чтобы arr2 по длине подходил, чтобы все влезло, иначе ошибка.
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        arr2[0] = 33;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        /*
        Скопируем только 3 элемента из массива arr1 с индекса 2 и вставим их, начиная с позиции, имеющей индекс 1 в массив arr2.
         */
        arr1 = new int[]{1,2,3,4,5};
        arr2 = new int[6];
        System.arraycopy(arr1,2,arr2,1,3);
        System.out.println(Arrays.toString(arr1)); //[1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(arr2)); //[0, 3, 4, 5, 0, 0]

        arr1[2]=127; // НЕ ИЗМЕНИЛСЯ МАССИВ ВТОРОЙ
        System.out.println(Arrays.toString(arr1)); //[1, 2, 127, 4, 5]
        System.out.println(Arrays.toString(arr2)); //[0, 3, 4, 5, 0, 0]



        int[][] bigArray = { {1,2,3,4}, {5,6,7,8} };
        int[][] bigArray2 =new int[2][4];
        System.arraycopy(bigArray,0,bigArray2,0,bigArray.length);
        System.out.println(Arrays.deepToString(bigArray2)); //[[1, 2, 3, 4], [5, 6, 7, 8]]
        System.out.println(Arrays.deepToString(bigArray)); //[[1, 2, 3, 4], [5, 6, 7, 8]]
        bigArray[1][0] = 128;
        System.out.println(Arrays.deepToString(bigArray)); //[[1, 2, 3, 4], [128, 6, 7, 8]]
        System.out.println(Arrays.deepToString(bigArray2)); //[[1, 2, 3, 4], [128, 6, 7, 8]] !!!!!!!!!!!!!

        int[][] bigArray3 = { {1,5,3,4}, {5,6,7,8} };
        int[][] bigArray4;
        bigArray4 = Arrays.copyOf(bigArray3,bigArray3.length);
        System.out.println(Arrays.deepToString(bigArray3)); //[[1, 5, 3, 4], [5, 6, 7, 8]]
        System.out.println(Arrays.deepToString(bigArray4)); //[[1, 5, 3, 4], [5, 6, 7, 8]]
        bigArray4[1][0] = 128;
        System.out.println(Arrays.deepToString(bigArray3)); // [[1, 5, 3, 4], [128, 6, 7, 8]]
        System.out.println(Arrays.deepToString(bigArray4)); //[[1, 5, 3, 4], [128, 6, 7, 8]]
    }
}
/*
[1, 2, 3, 4, 5]
[1, 2, 3, 4, 5]
[1, 2, 3, 4, 5]
[33, 2, 3, 4, 5]
[1, 2, 3, 4, 5]
[0, 3, 4, 5, 0, 0]
[[1, 2, 3, 4], [5, 6, 7, 8]]
 */