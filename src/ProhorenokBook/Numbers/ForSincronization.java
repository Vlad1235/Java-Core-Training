package ProhorenokBook.Numbers;

import java.util.Random;

/**
 * Значения двух случайных числе каждый раз будут одинковыми
 */
public class ForSincronization {
    public static void main(String[] args) {
        Random random = new Random(1);
        Random random1 = new Random(1);

        System.out.println(random.nextInt()); //-1155869325
        System.out.println(random1.nextInt()); //-1155869325
    }
}
