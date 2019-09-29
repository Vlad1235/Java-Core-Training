package ProhorenokBook.StaticVariable;

public class NonStaticExample {
     int x;

    public static void main(String[] args) {
        NonStaticExample nonStaticExample = new NonStaticExample();
        nonStaticExample.x = 10;
        System.out.println(nonStaticExample.x);
        int x = 20;
        System.out.println(x);
    }
}
/**
 10
 20
 */