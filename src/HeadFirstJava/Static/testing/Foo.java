package HeadFirstJava.Static.testing;

public class Foo {
    static final int x = 12; // константа не имеет никакого отношения к классу, в котором находится
    public void go(final int x){
        System.out.println(x);
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.go(11);
        System.out.println(Foo.x);
    }
}
/*
11
12
 */