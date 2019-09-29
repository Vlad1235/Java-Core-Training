package ProhorenokBook.StaticVariable;

public class Static4 {
    static int x;

    public static void main(String[] args) {
        x = 10;
        System.out.println(x);
        int x = 88;
        System.out.println(x);
        System.out.println(Static4.x);
    }
}
/*
10
88
10
*/