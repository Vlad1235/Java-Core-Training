package ProhorenokBook.Object_class;

import java.util.Date;

/**
 * Если в качестве типа указать класс Object, и ... то в метод можно будет передать произвольное колличество значений ЛЮБОГО типа.
 */
public class MyClas {

    public static void func(Object... a){ // ... это означает произвольное количество.
        for(Object b: a){
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        func(1,2.5,"строка");
        func(1, 2.5, 300L,"строка", new Date());
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
Wed Aug 21 05:06:51 JST 2019
 */