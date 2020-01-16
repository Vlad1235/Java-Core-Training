package Stacktrace;

import java.util.concurrent.ThreadLocalRandom;

public class Example {
    private static boolean isSorted(long[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        new Example().run(100_000_000, 10);
    }

    private void run(int experiments, int length) {
        int sorted = 0;

        for (int i = 0; i < experiments; i++) {
            try {
                long[] array = ThreadLocalRandom.current().longs(length).toArray();
                if (isSorted(array)) {
                    sorted++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.printf("%d of %d arrays are sorted\n", sorted, experiments);
    }
}
