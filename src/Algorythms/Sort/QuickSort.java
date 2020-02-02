package Algorythms.Sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentMap;

public class QuickSort {
    public static void quickSort(int[] array, int first, int last) {
        if (array == null || array.length == 0 || first >= last) return; //завершить выполнение если длина массива равна 0, или если уже нечего делить
        int i = first;
        int j = last;
        int core = first + (last - first) / 2; // выбрать опорный элемент (в общем случае, для всех последующих вызовов)
        // разделить на подмассивы, который больше и меньше опорного элемента
        while (i < j) { // обший цикл что идем навстречу
            while ((array[i] <= array[core]) && i < core) { // идем от начала пока не найдем элемент больше чем опорный (в элементах). Также ограничим в индексах, что проверка должна быть до опорного элемента
                i++;
            }
            while (array[j] >= array[core] && j > core) { // сдвигаем адрес к первому до опорного справа, как находим элемент меньший чем опорный - останавливаемся
                j--;
            }
            if (i < j) {// сверяем индексы
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == core) {
                    core = i;
                } else if (j == core) {
                    core = j;
                }
            }
            quickSort(array, first, core);
            quickSort(array, core+1 , last);
        }
    }

    public static void main(String[] args) {
        int[] x = {3, 1,15,55, 4, 7, 5, -3, -5,-8,-15};
        System.out.println("Было");
        System.out.println(Arrays.toString(x));
        int low = 0;
        int high = x.length - 1;
        quickSort(x, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
    }




}
