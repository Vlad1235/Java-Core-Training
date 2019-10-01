package ProhorenokBook.Generics.GenericInterface;

public class Test {
    public static void main(String[] args) {
        A<Integer> obj1 = new A<>(10);
        obj1.test(15);

        B<Integer,Double> obj2 = new B<>(10);
        obj2.test1(15);
        obj2.test2(2.5);

        C obj3 = new C(10);
        obj3.test(15);
    }
}
/*
A obj = 10
t = 15
t = 15
u = 2.5
C obj = 10
t = 15
 */