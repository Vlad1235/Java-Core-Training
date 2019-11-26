package Alishev.AlgorythmsDataStructure.binarysearch;

/**
 * Алгоритм БИНАРНОГО ПОИСКА
 */
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {-1,3,5,8,10,15,16,20},3)); // 1 это индекс элемента
    }

    public static int binarySearch(int[] a, int key) { // возвращает найденный индекс элемента
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (key < a[middle]) {
                high = middle - 1;
            } else if (key > a[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1; // если нет такого элемента, то вернет -1
    }
}
