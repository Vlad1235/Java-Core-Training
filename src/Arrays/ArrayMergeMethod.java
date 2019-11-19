package Arrays;

import java.util.Arrays;

/**
 * Даны два отсортированных массива.
 * Вам нужно написать метод, который берет элементы этих массивов и добавляет в третий массив.
 */
public class ArrayMergeMethod {
    public int[] merge(int[] left, int[] right) {
        int length = left.length + right.length;
        int[] rsl = new int[length];
        System.arraycopy(left,0,rsl,0,left.length);
        System.arraycopy(right,0,rsl,left.length,right.length);
        Arrays.sort(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        ArrayMergeMethod process = new ArrayMergeMethod();
        int[] rsl = process.merge (
                new int[] {1, 3, 5},
                new int[] {2, 4, 5, 9}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
