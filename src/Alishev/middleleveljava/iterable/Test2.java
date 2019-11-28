package Alishev.middleleveljava.iterable;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
Важное отличие Foreach() от Iterator(), при использовании Iterator() мы можем УДАЛЯТЬ Элементы

 Мы  НЕ МОЖЕМ УДАЛЯТЬ ЭЛЕМЕНТЫ ИЗ LIST ЕСЛИ МЫ ИСПОЛЬЗУЕМ FOREACH,
 и НАОБОРОТ МЫ МОЖЕМ УДАЛЯТЬ ЭЛЕМЕНТЫ ЕСЛИ ПРОХОДИМСЯ ПО НЕМУ ITERATOR()

 Можно удалять элемент из ЛИСТА, на который указывает указатель итератора!.
 Так как мы его УЖЕ прошли. То есть указатель с задержкой на один адрес идет!!! Поэтому мы можем удалить как бы предыдущий элемент.


 В методе Foreach такое не возможно, так как если мы удалим последующий, то метод не будет знать что дальше показывать, то есть какой элемент после удаленного
 *
 */
public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        int index = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){ // изначально указатель не указывает ни на что. нужно пройти один цикл чтобы он встал на элемент с индексом 0
            System.out.println(iterator.next());
            if (index==1) {
                iterator.remove(); // можем удалять текущий элемент и так как мы его уже прошли (строка 25) и у нас есть указатель на него.
            }
            index++;
        }
        System.out.println(list); // [2, 3] элемент удален


//        for (int x: list)
//            System.out.println(x);

    }
}
