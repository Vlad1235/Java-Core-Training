package Alishev.middleleveljava.set;

import java.util.HashSet;
import java.util.Set;

/**
 * ТЕОРИЯ МНОЖЕСТВ
 */
public class TestSetTheory {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();

        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();

        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);


        /*
        boolean containsAll​(Collection<?> c)
        true if this set contains all of the elements of the specified collection
         */
        System.out.println(set1.containsAll(set2)); // false


        // union - операция объединения множеств - объединение
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union); //[0, 1, 2, 3, 4, 5, 6, 7]

        // intersection - операция из теории множеств  - пересечение
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection); // [2, 3, 4, 5]

        // difference - операция из теории множеств - разность множеств
        Set<Integer> diffetence = new HashSet<>(set1);
        diffetence.removeAll(set2);
        System.out.println(diffetence); // [0, 1]






    }
}
