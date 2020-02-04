package Algorythms.Sort;


import java.util.Arrays;

public class MergeSort3 {
    public static void main(String[] args) {
        int[] array3 = {3, -1, 0, 34, -5, 12, 1, 2, 5, 5, 10};
        int[] sortedArray = sort(array3);
        System.out.println(Arrays.toString(sortedArray));
    }

        public static int[] sort(int[] arr) {
            if (arr.length <= 1)  return arr;
            int mid = arr.length / 2;
            int[] left = new int[mid];
            int[] right = new int[mid + arr.length%2];
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i < arr.length / 2) {
                    left[i] = arr[i];
                } else {
                    right[j++] = arr[i];
                }
            }
            return merge(sort(left), sort(right));
        }

    public static int[] merge(int[] left, int[] right) {
        int a = 0, b = 0;
        int[] merged = new int[left.length + right.length];
        //забиваем отсортированный массив из левой и правой частей
        for (int i = 0; i < left.length + right.length; i++) {
            //поочередно берем меньший член из крайних левого и правого
            if (b < right.length && a < left.length)
                if (left[a] > right[b] && b < right.length)
                    merged[i] = right[b++];
                else
                    merged[i] = left[a++];
            else
            if (b < right.length)
                merged[i] = right[b++];
            else
                merged[i] = left[a++];
        }
        return merged;
    }

}
