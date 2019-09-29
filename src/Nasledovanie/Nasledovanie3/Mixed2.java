package Nasledovanie.Nasledovanie3;

public class Mixed2 {
    // принцип работы наследования!
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.m1();
        b.m2();
        c.m3();
        b.m1(); //super() использовано
    }
}
/*
        a.m1();
        b.m2();
        c.m3();
        b.m1(); //super() использовано
Nasledovanie3.A's m1, Nasledovanie3.A's m2, Nasledovanie3.C's m3, 13 Nasledovanie3.A's m1, Nasledovanie3.B's m1,
 */

/*
        c.m1();
        c.m2();
        c.m3();
Nasledovanie3.B's m1, Nasledovanie3.A's m2, Nasledovanie3.C's m3, 13

        b.m1();
        c.m2();
        a.m3();
Nasledovanie3.B's m1, Nasledovanie3.A's m2, Nasledovanie3.A's m3,

        a.m1();
        b.m2();
        c.m3();
Nasledovanie3.A's m1, Nasledovanie3.A's m2, Nasledovanie3.C's m3, 13

        a.m1();
        b.m2();
        c.m3();
        b.m1();
Nasledovanie3.A's m1, Nasledovanie3.A's m2, Nasledovanie3.C's m3, 13A's m1, Nasledovanie3.B's m1,

 */