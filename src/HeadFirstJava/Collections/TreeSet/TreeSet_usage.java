package HeadFirstJava.Collections.TreeSet;

import java.util.TreeSet;

/**
 * Коллекции
 * Множество TreeSet выполняет те же функции, что и HashSet но еще и отсортирует итоговый массив
 */
public class TreeSet_usage {
    public static void main(String[] args) {
        new TreeSet_usage().go();
    }

    public void go(){
        Book b1 = new Book("Как устроены кошки");
        Book b2 = new Book("Постройте заново свое тело");
        Book b3 = new Book("В поиске Немо");

        TreeSet<Book> tree = new TreeSet<Book>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}
/*
[В поиске Немо, Как устроены кошки, Постройте заново свое тело]
 */