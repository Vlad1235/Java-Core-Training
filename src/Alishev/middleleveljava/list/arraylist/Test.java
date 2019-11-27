package Alishev.middleleveljava.list.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Главный минусы
 * 1.ArrayList это использование внутренного массива, когда при удалении элемента в середине списка (то есть не с конца) будет сдвиг всего массива влево. (Запомнить есть такой метод System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)). Если удалить последний элемент, то время константно.
 * 2. При заполнении изначального Arraylist значениями, создается новый ArrayList с количеством ячеек определяемых по формуле, и все старые копируются в новый ArrayList
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list);

        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        for (Integer element:list) {
            System.out.println(element);
        }

        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        /*

         /*
        ВАЖНО!! Почему нужно указывать тип интерфейса List, так как мы в процессе выполнения программы
        стало нужно удалять и заменять значения внутри ArrayList, тогда мы можем прям сослать на нее и !!не забыть передать значения!!
         Если укажем так ArrayList<Integer> list = new ArrayList<>(); то не сможем сделать это.
         */

        list = new LinkedList<>(list); // теперь мы продолжаем работать с теми же данными но используем класс LinkedList();
        System.out.println(list.size()); // 10
        System.out.println(list); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        // И в обратном направлении
        list = new ArrayList<>(list);
        System.out.println(list.size()); // 10
        System.out.println(list); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]



    }
}
