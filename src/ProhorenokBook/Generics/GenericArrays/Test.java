package ProhorenokBook.Generics.GenericArrays;

import java.util.ArrayList;

/**
 * НЕЛЬЗЯ создавать массив объектов обобщенного типа!!!
 * Вместо создания массива мы можем воспоьзоваться обобщенным классом ArrayList
 */
public class Test {
    public static void main(String[] args) {
         A<Integer> obj1 = new A<>(10);
         A<Integer> obj2 = new A<>(100);
         A<Integer> obj3 = new A<>(10000);
        System.out.println(obj1.getN());
        System.out.println(obj2.getN());
        System.out.println(obj3.getN());

        /*
        Использование ArrayList
         */
        ArrayList<A<Integer>> arr = new ArrayList<A<Integer>>();
        arr.add(obj1);
        arr.add(obj2);
        arr.add(obj3);
        int x = arr.size();
        System.out.println(x);
    }
}
/*
10
100
10000
3
 */