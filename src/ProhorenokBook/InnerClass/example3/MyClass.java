package ProhorenokBook.InnerClass.example3;

/**
 * Статические вложенные классы
 */
public class MyClass {
    public static void main(String[] args) {
        A.B obj = new A.B();
        obj.func();
        A obj2 = new A();
        obj2.func();
    }
}
/*
A.B.func()
10
A.func()
A.B.func()
10
 */