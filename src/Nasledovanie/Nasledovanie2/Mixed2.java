package Nasledovanie.Nasledovanie2;

public class Mixed2 {

        public static void main(String[] args) {
            A a = new A();
            B b = new B();
            C c = new C();
            A a2 = new C(); // родительский тип А ссылки

            a2.m1();
            a2.m2();
            a2.m3();
        }
}
/*
Nasledovanie2.B's m1, Nasledovanie2.A's m2, Nasledovanie2.C's m3, 13
Видно что вызыванные из методов значения идут с САМОГО НИЖНЕГО И С КАЖДОГО СЛЕДУЮЩЕГО ПО СТУПЕНИ
 */
