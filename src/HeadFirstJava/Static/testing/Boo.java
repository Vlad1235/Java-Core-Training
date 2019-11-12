package HeadFirstJava.Static.testing;

public class Boo {
    int x = 12;
    public static void go(final int x){ // метод не имеет никакого отношения к классу где находится
        System.out.println(x);
    }

    public static void main(String[] args) {
        Boo.go(13);
        Boo boo = new Boo();
        System.out.println(boo.x);
    }
}
/*
 13
 12
 */