package Alishev.middleleveljava.set;

import LaforteTraining.Ch2_Arrays.ExcerciseProjects.Task21.HighArray;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Множество -  ХРАНЕНИЕ УНИКАЛЬНЫХ ЗНАЧЕНИЙ.
 * List и Set ВО МНОГОМ ПОХОЖИ, ТАК КАК ОБА ХРАНЯТ ОДИНОЧНЫЕ ЗНАЧЕНИЯ. ТОЛЬКО В Set в отличие от List  нельзя хранить повторяющие элементы
 *
 * HashSet - не сохраняет никакого порядка (также как и HashMap). Положим элементы в одном порядке, а извлекать будем в случайном порядке
 * LinkedHashSet - сохраняется порядок ввода! (также как и в LinkedHashMap)
 * TreeSet - элементы сортируются по естественному порядку.
 *
 * Лексигорафический порядок:
 * a<b<c.....
 * aa<ab
 *Та строка меньше, чьи буквы стоят ближе к НАЧАЛУ АЛФАВИТА!!! Им присваевается от 0-а 1-б и тд и поэтому так
 *
 *
 *метод contains(obj elem) вывод значения за время O(1) за счет принципа хеширования.
 * В сравнение с методом contains() из классов List, неважно ArrayList, LinkedList везде поиск проходит за время O(n), то есть по всем например 1 000 000 значениям
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>(); //  Mike Tom George Katy Donald  НЕТ ПОРЯДКА В ВЫВОДЕ!!!
        Set<String> linkedHashSet = new LinkedHashSet<>(); // Mike Katy Tom George Donald  ПОРЯДОК СОХРАНИЛСЯ!!
        Set<String> treeSet = new TreeSet<>(); // Donald George Katy Mike Tom  ОТСОРТИРОВАЛСЯ!!

        hashSet.add("Katy");
        hashSet.add("Tom");
        hashSet.add("George");
        hashSet.add("Donald");
        hashSet.add("Mike");
        hashSet.add("Tom"); // для примера работы интерфейса Set положим имя Tom несколько раз
        hashSet.add("Tom"); // для примера работы интерфейса Set положим имя Tom несколько раз. В интерфейсе List он бы вывелся, тут ЛИШЬ ОДИН РАЗ ПОПРЕЖНЕМУ

        for (String name: hashSet) {
            System.out.print(name+ " ");
        }

        System.out.println(hashSet.contains("Tom")); // true
        System.out.println(hashSet.contains("Tim")); // false

        System.out.println(hashSet.isEmpty()); // false




    }
}
