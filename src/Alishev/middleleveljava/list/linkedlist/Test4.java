package Alishev.middleleveljava.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * linkedList двусвязный и параметизованный
 */
public class Test4 {
    public static void main(String[] args) {
        MyLinkedListRealization myLinkedListRealization = new MyLinkedListRealization();
        myLinkedListRealization.add(1);
        myLinkedListRealization.add(2);
        myLinkedListRealization.add(10);
        System.out.println(myLinkedListRealization); // [1, 2, 10]
        System.out.println(myLinkedListRealization.get(1)); // 2
        System.out.println(myLinkedListRealization.get(0)); // 1
        System.out.println(myLinkedListRealization.get(2)); // 10
        myLinkedListRealization.remove(1);
        System.out.println(myLinkedListRealization); // [1, 10]

    }
}
