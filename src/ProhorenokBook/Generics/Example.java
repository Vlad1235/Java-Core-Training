package ProhorenokBook.Generics;

import java.util.Date;

/**
 * Передача произвольного колличества значений ЛЮБОГО типа
 */
public class Example {
    public static void main(String[] args) {
        Example.func(1,2.5,"строка");
        System.out.println();
        Example.func(1,2.5,300L,"строка",new Date());
    }


    public static void func(Object...a){
        for (Object b:a){
            System.out.println(b);
        }
    }
}
/*
1
2.5
строка

1
2.5
300
строка
Sun Dec 08 17:44:16 JST 2019
 */