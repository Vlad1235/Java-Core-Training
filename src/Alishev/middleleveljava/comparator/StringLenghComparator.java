package Alishev.middleleveljava.comparator;

import java.util.Comparator;

public class StringLenghComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        /*
        если первый объект больше чем второй то 1
        если первый меньше чем второй то -1
        если первый равен второму то 0

        пример
        compare(2,1)=>1
        compare(1,2)=>-1
        compare(1,1)=>0
         */

        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}
