package ProhorenokBook.Collections.Stack_usage;

import java.util.Stack;


/**
 * Класс Stack<E> наследует класс Vector<E>  и добавляет функционал стека (Очереди LIFO).
 * Класс наследует все методы из класса Vector<E> и добавляет несколько своих
 */
public class Test1 {
    public static void main(String[] args) {
        /*
        peek() возвращает последний элемент из очереди не удаляя его
        pop() возвращает последний элемент из очереди  удаляя его
         */
        Stack<Integer> arr0 = new Stack<>();
        arr0.push(1);
        arr0.push(2);
        arr0.push(3);
        System.out.println(arr0.peek()); //3
        System.out.println(arr0.toString()); // [1, 2, 3]
        System.out.println(arr0.pop()); // 3
        System.out.println(arr0.toString()); //[1, 2]

    }
}
