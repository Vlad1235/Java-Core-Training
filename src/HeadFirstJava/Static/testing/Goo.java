package HeadFirstJava.Static.testing;

public class Goo {
    static final int x = 12;

    public void go(){
        System.out.println(x);
    }

    public static void main(String[] args) {
        Goo goo = new Goo();
        goo.go();
        System.out.println(Goo.x);
    }
}
/*
12
12
 */