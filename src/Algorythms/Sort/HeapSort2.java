package Algorythms.Sort;

import java.util.Arrays;
/**
 * Пирамидальная сортировка
 */
public class HeapSort2 {

    public static void main(String[] args) {
        int[] array = {3, -1, 0, 34, -5, 12, 1, 2, 5, 5, 10};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void heapSort(int[] arr) {
        for(int i = arr.length; i > 1; i--){
            buildMaxHeap(arr, i - 1);
        }
    }

    public static void buildMaxHeap(int[] arr, int max_index){
        int i, o;
        int leftChild, rightChild, maxChild, root, temp;
        root = (max_index -1)/2;
        //обходим дерево в поисках максимального члена (ранее отсортированные максимальные игнорируем)
        for(i = root; i >= 0; i--){
            leftChild = (2*i) + 1;
            rightChild = (2*i) + 2;
            if((leftChild <= max_index) && (rightChild <= max_index)){
                if(arr[rightChild] >= arr[leftChild])
                    maxChild = rightChild;
                else
                    maxChild = leftChild;
            } else{
                if(rightChild > max_index)
                    maxChild = leftChild;
                else
                    maxChild = rightChild;
            }
            //передвигаем  максимальный член вверх по пирамиде (начало массива)
            if(arr[i] < arr[maxChild]){
                temp = arr[i];
                arr[i] = arr[maxChild];
                arr[maxChild] = temp;
            }
        }
        //убираем максимальный член в конец массива
        temp = arr[0];
        arr[0] = arr[max_index];
        arr[max_index] = temp;
    }
}
