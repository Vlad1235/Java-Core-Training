package ProhorenokBook.Generics.GenericMethods.GenericMethod2;

public class Test {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.<Integer>print(10);
        obj1.print(10);

        B<Integer> obj2 = new B<Integer>(50);
        obj2.<String> print(10, "Строка");
        obj2.print(10, "Строка");
    }
}
/*
10
10
10
Строка
50
10
Строка
50
 */