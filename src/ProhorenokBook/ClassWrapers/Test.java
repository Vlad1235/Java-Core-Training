package ProhorenokBook.ClassWrapers;

/**
 * Использование класса обертки. Автоматическая обертка.
 */
public class Test {
    public static void main(String[] args) {
        Object n = 4;
        System.out.println(n); // 4
        System.out.println(n.getClass()); // class java.lang.Integer

        Integer x = Integer.valueOf(10);
        int y = x.intValue();
        System.out.println(y); // 10
    }
}
