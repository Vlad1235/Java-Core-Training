package Alishev.middleleveljava.stack;

import java.util.Stack;

/**
 * Работает по принципу LIFO.
 * Это в противоположность классу Queue
 *
 * Для запоминания используй метафору про блины.
 * Печем блины и кладем из на тарелку.
 * Когда испекли и хотите начать есть, то берете последний испеченый.
 */
public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // 5 <- 3 <- 1

        stack.push(5);
        stack.push(3);
        stack.push(1);


        System.out.println(stack.pop()); // 1   достает последний добавленный элемент из стека и удаляет его
        System.out.println(stack.pop()); // 3
        System.out.println(stack.pop()); // 5 последний блин)
        // System.out.println(stack.pop()); ошибка EmptyStackException

        stack.push(7);
        stack.push(4);
        stack.push(2);

        System.out.println(stack.peek()); // 2   достает последий элемент и потом ОБРАТНО В СТЕК его кладет
        System.out.println(stack.peek()); // 2    каждый раз будет он вызываться
        System.out.println(stack.peek()); // 2

        while (!stack.isEmpty()){
            System.out.print (stack.pop() +" "); // 2 4 7 и теперь стек стал пустым
        }
        System.out.println(stack.isEmpty()); // true


    }
}
